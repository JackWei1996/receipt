/*
 * All rights Reserved, Copyright (C) Aisino LIMITED 2018
 * FileName: IOrderService.java
 * Version:  $Revision$
 * Modify record:
 * NO. |     Date       |    Name         |      Content
 * 1   | 2018年12月6日        | Aisino)JackWei    | original version
 */
package com.aisino.receipt.service;

import java.util.List;

import com.aisino.receipt.bean.Order;

/**
 * class name:IOrderService <BR>
 * class description: 订单接口 <BR>
 * Remark: <BR>
 * @version 1.00 2018年12月6日
 * @author Aisino)weihaohao
 */
public interface IOrderService {
	//生成订单
	public List<Order> createOrder();
}
