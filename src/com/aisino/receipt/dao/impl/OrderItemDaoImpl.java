/*
 * All rights Reserved, Copyright (C) Aisino LIMITED 2018
 * FileName: OrderItem.java
 * Version:  $Revision$
 * Modify record:
 * NO. |     Date       |    Name         |      Content
 * 1   | 2018年12月6日        | Aisino)JackWei    | original version
 */
package com.aisino.receipt.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.aisino.receipt.bean.OrderItem;
import com.aisino.receipt.dao.IOrderItemDao;

/**
 * class name:OrderItem <BR>
 * class description: 商品列表实现类 <BR>
 * Remark: <BR>
 * @version 1.00 2018年12月6日
 * @author Aisino)weihaohao
 */
public class OrderItemDaoImpl implements IOrderItemDao{

	/**
	 * @Override
	 * @see com.aisino.receipt.dao.IOrderItemDao#findAllOrderItem() <BR>
	 * Method name: findAllOrderItem <BR>
	 * Description: 获取所有商品列表 <BR>
	 * Remark: <BR>
	 * @return  <BR>
	*/
	@Override
	public List<OrderItem> findAllOrderItem() {
		List<OrderItem> orderItems = new ArrayList<>();
		OrderItem item1 = new OrderItem(1, "00001", "电脑", "家电", "京东",
				6789, 75, 509175, 0.16, 590643);
		orderItems.add(item1);
		item1 = new OrderItem(2, "00002", "电视机", "家电", "淘宝", 
				8888, 5, 44440, 0.16, 51550.4);
		orderItems.add(item1);
		item1 = new OrderItem(3, "00003", "平板电脑", "家电", "京东", 
				9999, 19, 189981, 0.16, 220377.96);
		orderItems.add(item1);
		item1 = new OrderItem(4, "00004", "键盘", "家电", "易买得", 
				555, 32, 17760, 0.16, 20601.6);
		orderItems.add(item1);
		
		item1 = new OrderItem(5, "00005", "会议桌子", "办公", "京东", 
				7711, 7, 53977, 0.16, 62613.32);
		orderItems.add(item1);
		
		item1 = new OrderItem(6, "00006", "洗衣机", "家电", "淘宝", 
				1122, 1, 1122, 0.16, 1301.52);
		orderItems.add(item1);
		
		item1 = new OrderItem(7, "00007", "冰箱", "家电", "国美", 
				9862, 4, 39448, 0.16, 45759.68);
		orderItems.add(item1);
		item1 = new OrderItem(8, "00008", "沙发", "家电", "家乐福", 
				9634, 5, 48170, 0.16, 55877.2);
		orderItems.add(item1);
		item1 = new OrderItem(9, "00009", "台式灯", "办公", "京东", 
				88, 23, 2024, 0.16, 2347.84);
		orderItems.add(item1);
		item1 = new OrderItem(10, "00010", "水杯", "日用品", "天猫", 
				55, 3, 165, 0.16, 191.4);
		orderItems.add(item1);
		item1 = new OrderItem(11, "00011", "鼠标", "家电", "天猫", 
				123, 71, 8733, 0.16, 10130.28);
		orderItems.add(item1);
		
		return orderItems;
	}

	public List<OrderItem> findAllOrderItem2() {
		List<OrderItem> orderItems = new ArrayList<>();
		OrderItem item1 = new OrderItem(1, "000012", "电脑", "家电", "京东",
				6789, 75, 509175.55, 0.16, 590643);
		orderItems.add(item1);
		item1 = new OrderItem(2, "000013", "电视机", "家电", "淘宝", 
				8888, 5, 44440.66, 0.16, 51550.4);
		orderItems.add(item1);
		item1 = new OrderItem(3, "000014", "平板电脑", "家电", "京东", 
				9999, 19, 189981.88, 0.16, 220377.96);
		orderItems.add(item1);
		item1 = new OrderItem(4, "000015", "键盘", "家电", "易买得", 
				555, 32, 17760.85, 0.16, 20601.6);
		orderItems.add(item1);
		
		item1 = new OrderItem(5, "000016", "会议桌子", "办公", "京东", 
				7711, 7, 53977.91, 0.16, 62613.32);
		orderItems.add(item1);
		
		item1 = new OrderItem(6, "000017", "洗衣机", "家电", "淘宝", 
				1122, 1, 1122.33, 0.16, 1301.52);
		orderItems.add(item1);
		
		item1 = new OrderItem(7, "000018", "冰箱", "家电", "国美", 
				9862, 4, 39448.21, 0.16, 45759.68);
		orderItems.add(item1);
		item1 = new OrderItem(8, "000019", "沙发", "家电", "家乐福", 
				9634, 5, 48170.36, 0.16, 55877.2);
		orderItems.add(item1);
		item1 = new OrderItem(9, "000020", "台式灯", "办公", "京东", 
				88, 23, 2024.37, 0.16, 2347.84);
		orderItems.add(item1);
		item1 = new OrderItem(10, "00021", "水杯", "日用品", "天猫", 
				55, 3, 165.95, 0.16, 191.4);
		orderItems.add(item1);
		item1 = new OrderItem(11, "00022", "鼠标", "家电", "天猫", 
				123, 71, 8733.25, 0.16, 10130.28);
		orderItems.add(item1);
		
		return orderItems;
	}
	
	public List<OrderItem> findAllOrderItem3() {
		List<OrderItem> orderItems = new ArrayList<>();
		OrderItem item1 = new OrderItem(1, "000023", "电脑", "家电", "京东",
				6789, 75, 509175, 0.16, 590643);
		orderItems.add(item1);
		item1 = new OrderItem(2, "000024", "电视机", "家电", "淘宝", 
				8888, 5, 44440, 0.16, 51550.4);
		orderItems.add(item1);
		item1 = new OrderItem(3, "000025", "平板电脑", "家电", "京东", 
				9999, 19, 189981, 0.16, 220377.96);
		orderItems.add(item1);
		item1 = new OrderItem(4, "000026", "键盘", "家电", "易买得", 
				555, 32, 17760, 0.16, 20601.6);
		orderItems.add(item1);
		
		item1 = new OrderItem(5, "000027", "会议桌子", "办公", "京东", 
				7711, 7, 53977, 0.16, 62613.32);
		orderItems.add(item1);
		
		item1 = new OrderItem(6, "000028", "洗衣机", "家电", "淘宝", 
				1122, 1, 1122, 0.16, 1301.52);
		orderItems.add(item1);
		
		item1 = new OrderItem(7, "000029", "冰箱", "家电", "国美", 
				9862, 4, 39448, 0.16, 45759.68);
		orderItems.add(item1);
		item1 = new OrderItem(8, "000030", "沙发", "家电", "家乐福", 
				9634, 5, 48170, 0.16, 55877.2);
		orderItems.add(item1);
		item1 = new OrderItem(9, "000031", "台式灯", "办公", "京东", 
				88, 23, 2024, 0.16, 2347.84);
		orderItems.add(item1);
		item1 = new OrderItem(10, "00032", "水杯", "日用品", "天猫", 
				55, 3, 165, 0.16, 191.4);
		orderItems.add(item1);
		item1 = new OrderItem(11, "00033", "鼠标", "家电", "天猫", 
				123, 71, 8733, 0.16, 10130.28);
		orderItems.add(item1);
		
		orderItems.add(item1);
		item1 = new OrderItem(2, "000034", "电视机", "家电", "淘宝", 
				8888, 5, 44440, 0.16, 51550.4);
		orderItems.add(item1);
		item1 = new OrderItem(3, "000035", "平板电脑", "家电", "京东", 
				9999, 19, 189981, 0.16, 220377.96);
		orderItems.add(item1);
		item1 = new OrderItem(4, "000036", "键盘", "家电", "易买得", 
				555, 32, 17760, 0.16, 20601.6);
		orderItems.add(item1);
		
		item1 = new OrderItem(5, "000037", "会议桌子", "办公", "京东", 
				7711, 7, 53977, 0.16, 62613.32);
		orderItems.add(item1);
		
		item1 = new OrderItem(6, "000038", "洗衣机", "家电", "淘宝", 
				1122, 1, 1122, 0.16, 1301.52);
		orderItems.add(item1);
		
		item1 = new OrderItem(7, "000039", "冰箱", "家电", "国美", 
				9862, 4, 39448, 0.16, 45759.68);
		orderItems.add(item1);
		item1 = new OrderItem(8, "000040", "沙发", "家电", "家乐福", 
				9634, 5, 48170, 0.16, 55877.2);
		orderItems.add(item1);
		item1 = new OrderItem(9, "000041", "台式灯", "办公", "京东", 
				88, 23, 2024, 0.16, 2347.84);
		orderItems.add(item1);
		item1 = new OrderItem(10, "00042", "水杯", "日用品", "天猫", 
				55, 3, 165, 0.16, 191.4);
		orderItems.add(item1);
		item1 = new OrderItem(11, "00043", "鼠标", "家电", "天猫", 
				123, 71, 8733, 0.16, 10130.28);
		orderItems.add(item1);
		
		return orderItems;
	}
}
