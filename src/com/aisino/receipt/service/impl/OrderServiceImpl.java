/*
 * All rights Reserved, Copyright (C) Aisino LIMITED 2018
 * FileName: OrderServiceImpl.java
 * Version:  $Revision$
 * Modify record:
 * NO. |     Date       |    Name         |      Content
 * 1   | 2018年12月6日        | Aisino)JackWei    | original version
 */
package com.aisino.receipt.service.impl;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.aisino.receipt.bean.Order;
import com.aisino.receipt.bean.OrderItem;
import com.aisino.receipt.dao.impl.OrderItemDaoImpl;
import com.aisino.receipt.service.IOrderService;
import com.aisino.receipt.util.CreateOrder;
import com.aisino.receipt.util.PropertyUtil;

/**
 * class name:OrderServiceImpl <BR>
 * class description: please write your description <BR>
 * Remark: <BR>
 * @version 1.00 2018年12月6日
 * @author Aisino)weihaohao
 */
public class OrderServiceImpl implements IOrderService {

	/**
	 * @Override
	 * @see com.aisino.receipt.service.IOrderService#createOrder(java.util.List, double) <BR>
	 * Method name: createOrder <BR>
	 * Description: 生成订单实现类 <BR>
	 * Remark: <BR>
	 * @param orderItems
	 * @param limit
	 * @return  <BR>
	*/

	@Override
	public List<Order> createOrder() {
		//从数据源获取商品列表
		OrderItemDaoImpl orderItemDao = new OrderItemDaoImpl();
		//可以更改数据源
		List<OrderItem> orderItems = orderItemDao.findAllOrderItem3();
		//自定义限额默认值
		double limit = 100000;
		//从配置文件中获取限额
		String limitStr = PropertyUtil.getConfigureProperties("limit");
		if(null!=limitStr) {
			limit = Double.parseDouble(limitStr);
			Logger logger = Logger.getLogger("lavasoft"); 
			logger.setLevel(Level.INFO); 
			logger.log(Level.INFO, "限额是：{0}", limit);
		}
		//调用工具类生成订单
	
		return CreateOrder.createOrder(orderItems, limit-1);
	}

}
