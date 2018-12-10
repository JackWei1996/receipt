/*
 * All rights Reserved, Copyright (C) Aisino LIMITED 2018
 * FileName: IOrderItemDao.java
 * Version:  $Revision$
 * Modify record:
 * NO. |     Date       |    Name         |      Content
 * 1   | 2018年12月6日        | Aisino)JackWei    | original version
 */
package com.aisino.receipt.dao;

import java.util.List;

import com.aisino.receipt.bean.OrderItem;

/**
 * class name:IOrderItemDao <BR>
 * class description: 获取商品列表接口 <BR>
 * Remark: <BR>
 * @version 1.00 2018年12月6日
 * @author Aisino)weihaohao
 */
public interface IOrderItemDao {
	//找到所有商品
	public List<OrderItem> findAllOrderItem();
}
