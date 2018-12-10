/*
 * All rights Reserved, Copyright (C) Aisino LIMITED 2018
 * FileName: OrderItemSort.java
 * Version:  $Revision$
 * Modify record:
 * NO. |     Date       |    Name         |      Content
 * 1   | 2018年12月6日        | Aisino)JackWei    | original version
 */
package com.aisino.receipt.util;

import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.aisino.receipt.bean.OrderItem;

/**
 * class name:OrderItemSort <BR>
 * class description: please write your description <BR>
 * Remark: <BR>
 * @version 1.00 2018年12月6日
 * @author Aisino)weihaohao
 */
public class OrderItemSort {
	
	private OrderItemSort() {
		throw new IllegalStateException("Utility class");
	}
	/**
	 * Method name: orderItemSortByValue <BR>
	 * Description: 根据商品不含税值进行排序 <BR>
	 * Remark: <BR>
	 * @param orderItems要排序的集合
	 * @param sort--DESC降序,ASC升序<BR>
	 */
	public static void orderItemSortByValue(List<OrderItem> orderItems, String sort) {
		switch (sort) {
		case "DESC"://降序
			Collections.sort(orderItems, (arg0,arg1)->
	             arg0.getValue()>arg1.getValue()?-1:1
	        );
			break;
		case "ASC"://升序
			Collections.sort(orderItems, (arg0,arg1)->
            	arg0.getValue()>arg1.getValue()?1:-1
			);
			break;
		default:
			Logger logger = Logger.getLogger("lavasoft"); 
			logger.setLevel(Level.INFO); 
			logger.log(Level.INFO,"输入排序的参数有误!");
			break;
		}
	}
}
