/*
 * All rights Reserved, Copyright (C) Aisino LIMITED 2018
 * FileName: CreateOrder.java
 * Version:  $Revision$
 * Modify record:
 * NO. |     Date       |    Name         |      Content
 * 1   | 2018年12月6日        | Aisino)JackWei    | original version
 */
package com.aisino.receipt.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.aisino.receipt.bean.Order;
import com.aisino.receipt.bean.OrderItem;

/**
 * class name:CreateOrder <BR>
 * class description: 根据限额生成订单 <BR>
 * Remark: <BR>
 * @version 1.00 2018年12月6日
 * @author Aisino)weihaohao
 */
public class CreateOrder {
	
	private CreateOrder() {
	    throw new IllegalStateException("Utility class");
	}
	
	//生成订单集合
	private static List<Order> orders = new ArrayList<>();
	
	/**
	 * Method name: createOrder <BR>
	 * Description: 生成订单工具方法, <BR>
	 * Remark: <BR>
	 * @param orderItems    订单商品列表
	 * @param limit			限额
	 * @return  List<Order><BR>
	 */
	public static List<Order> createOrder(List<OrderItem> orderItems, double limit){
		Logger logger = Logger.getLogger("lavasoft"); 
		logger.setLevel(Level.INFO); 
		
		//如果商品为空
		if(null==orderItems) {
			logger.log(Level.INFO,"订单里面的商品为空！");
			return Collections.emptyList();
		}
		
		//如果限额小于等于0
		if(0>=limit) {
			logger.log(Level.INFO,"限额出错，小于等于0！");
			return Collections.emptyList();
		}
		
		//从大到小排序
		OrderItemSort.orderItemSortByValue(orderItems, "DESC");
		
		int i = 0;//下标
		int len = orderItems.size();//所有商品数量
		
		//如果商品不含税价格大于限额,生成订单
		while(i<len) {
			double value = orderItems.get(i).getValue();
			
			if(value >= limit) {
				//处理大于限额
				opMax(orderItems, limit, i);
				i++;
			}else {
				break;
			}
			//如果在处理中移除了,一定要i--
			if(len!=orderItems.size()) {
				len = orderItems.size();
				i--;
			}
		}

		//如果商品不含税价格小于限额,生成订单
		while(!orderItems.isEmpty()) {
			//从大到小排序
			OrderItemSort.orderItemSortByValue(orderItems, "DESC");
			//处理小于限额
			opMin(orderItems, limit, 0);
		}
		
		return orders;
	}
	
	/**
	 * Method name: opMax <BR>
	 * Description: 处理大于限额的情况 <BR>
	 * Remark: <BR>
	 * @param orderItems
	 * @param limit
	 * @param i
	 * @return  List<OrderItem><BR>
	 */
	public static void opMax(List<OrderItem> orderItems, double limit, int i) {
		//获取第一个值
		double value = orderItems.get(i).getValue();
		//如果商品不含税价格大于限额
		while(value >= limit) {
			//生成一个订单
			Order order = new Order();
			//订单下面的商品列表
			List<OrderItem> items = new ArrayList<>();
			//获取当前商品
			OrderItem item = (OrderItem) orderItems.get(i).clone();//要用克隆,不然赋值的是引用类型会出错!
			//设置当前商品为订单最大值
			item.setValue(limit);
			//设置订单商品,且价格不为0
			if(item.getValue() > 0.000001) {
				items.add(item);
			}
			
			order.setItems(items);
			//放到订单列表中
			orders.add(order);
			//修改当前商品不含税值为减去限额
			orderItems.get(i).setValue(DoubleScale2.doubleRound(value - limit,2));
			value -= limit;
			value = DoubleScale2.doubleRound(value,2);
			//如果不含税值减去后为0则要把这条记录移除掉
			if(value < 0.000001) {
				orderItems.remove(i);
			}
		}
	}
	
	/**
	 * Method name: opMin <BR>
	 * Description: 处理小于限额情况 <BR>
	 * Remark: <BR>
	 * @param orderItems
	 * @param limit
	 * @param i  void<BR>
	 */
	public static void opMin(List<OrderItem> orderItems, double limit, int i) {
		int len = orderItems.size();//记录长度
		double value = orderItems.get(i).getValue();//获取记录第一个值
		double addValue = 0;//中间值,用于记录大于限额的值
		Order order = new Order();//创建空订单
		List<OrderItem> items = new ArrayList<>();
		//如果商品不含税价格小于限额
		while(value <= limit && i<len-1) {
			//加上下一个金额
			i++;
			value += orderItems.get(i).getValue();//依次相加记录里面的值
			value = DoubleScale2.doubleRound(value, 2);//保留2位小数
			//获取当前商品
			OrderItem item =  (OrderItem) orderItems.get(i-1).clone();//要用克隆,不然赋值的是引用类型会出错!
			//设置订单商品,且价格不为0
			if(item.getValue() > 0.000001) {
				items.add(item);
			}
			orderItems.remove(i-1);//移除小于限额的。
			len = orderItems.size();//重新计算长度
			i=0;//从第一个开始
		}
		
		addValue = value;
		//如果相加的大于限定的
		if(addValue>limit) {
			OrderItem item = (OrderItem) orderItems.get(0).clone();//要用克隆,不然赋值的是引用类型会出错!
			item.setValue(DoubleScale2.doubleRound(limit-(DoubleScale2.doubleRound(addValue-item.getValue(),2)),2));
			//设置订单商品,且价格不为0
			if(item.getValue() > 0.000001) {
				items.add(item);
			}
		}
		
		//没有找到最末尾
		if(len!=1) {	
			//设置第一个值
			orderItems.get(0).setValue(DoubleScale2.doubleRound(value-limit,2));
		}else {//找到最末尾
			OrderItem item = (OrderItem) orderItems.get(0).clone();//要用克隆,不然赋值的是引用类型会出错!
			if(item.getValue() > 0.000001) {//不能为0,为零就不用加进去
				items.add(item);
			}
			orderItems.remove(0);//移除最后一个
		}
		//设置订单商品
		order.setItems(items);
		
		orders.add(order);
	}
}