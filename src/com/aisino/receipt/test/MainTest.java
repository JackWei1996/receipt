/*
 * All rights Reserved, Copyright (C) Aisino LIMITED 2018
 * FileName: MainTest.java
 * Version:  $Revision$
 * Modify record:
 * NO. |     Date       |    Name         |      Content
 * 1   | 2018年12月6日        | Aisino)JackWei    | original version
 */
package com.aisino.receipt.test;

import java.util.List;

import org.junit.Test;

import com.aisino.receipt.bean.Order;
import com.aisino.receipt.bean.OrderItem;
import com.aisino.receipt.service.IOrderService;
import com.aisino.receipt.service.impl.OrderServiceImpl;
import com.aisino.receipt.util.DoubleScale2;
import com.aisino.receipt.util.PropertyUtil;

/**
 * class name:MainTest <BR>
 * class description: please write your description <BR>
 * Remark: <BR>
 * @version 1.00 2018年12月6日
 * @author Aisino)weihaohao
 */
public class MainTest {
	@Test
	public void testMain() {
		//订单业务对象
		IOrderService orderService = new OrderServiceImpl();
		//生成订单
		List<Order> orders = orderService.createOrder();
		//生成发票订单验证金额
		double ckValue1 = 0;
		//所有商品金额
		double ckValue2 = 0;
		//每个发票总额
		double value = 0;
		//发票个数
		int n = 0;
		if(null!=orders) {//商品不为空		
			//输出订单
			for (Order order : orders) {
				n++;
				value = 0;
				System.out.println("订单:"+n+"商品列表:");
				//System.out.println(order);
				for (OrderItem item : order.getItems()) {
					double tem = item.getValue();
					System.out.println("商品名:"+item.getProdName()+", 价格:"+tem);
					value += tem;
					ckValue2 += tem;
				}
				System.out.println("总价格:"+DoubleScale2.doubleRound(value,2));
				System.out.println("-------------------------------------------------");
			}
		}else {//商品为空时
			System.out.println("空订单");
		}
		
		double limit = 0;
		String limitStr = PropertyUtil.getConfigureProperties("limit");
		if(null!=limitStr) {
			limit = Double.parseDouble(limitStr);
			limit -= 1;
		}
		
		System.out.println("发票总金额:"+(ckValue1=DoubleScale2.doubleRound((limit*(n-1))+value,2))+" , 商品总金额:"+(ckValue2=DoubleScale2.doubleRound(ckValue2,2)));
		if(ckValue1 == ckValue2) {
			System.out.println("总金额验证成功:)");
		}else {
			System.out.println("总金额验证失败:(");
		}
	}
	
	@Test
	public void test2() {
		System.out.println(DoubleScale2.doubleRound(200, 4));
	}
	
}
