/*
 * All rights Reserved, Copyright (C) Aisino LIMITED 2018
 * FileName: Order.java
 * Version:  $Revision$
 * Modify record:
 * NO. |     Date       |    Name         |      Content
 * 1   | 2018年12月6日        | Aisino)JackWei    | original version
 */
package com.aisino.receipt.bean;

import java.util.Date;
import java.util.List;

/**
 * class name:Order <BR>
 * class description: please write your description <BR>
 * Remark: <BR>
 * @version 1.00 2018年12月6日
 * @author Aisino)weihaohao
 */
public class Order {
	private int id;					//订单自增id
	private String orderNr;			//订单号
	private Date orderDate;			//订单日期
	private String custName;		//客户名称
	private String custTaxNr;		//客户税编号
	private String custAddress;		//客户地址
	private String custBankAccount;	//客户银行账户
	private List<OrderItem> items;	//客户所买商品列表
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderNr() {
		return orderNr;
	}
	public void setOrderNr(String orderNr) {
		this.orderNr = orderNr;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustTaxNr() {
		return custTaxNr;
	}
	public void setCustTaxNr(String custTaxNr) {
		this.custTaxNr = custTaxNr;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public String getCustBankAccount() {
		return custBankAccount;
	}
	public void setCustBankAccount(String custBankAccount) {
		this.custBankAccount = custBankAccount;
	}
	public List<OrderItem> getItems() {
		return items;
	}
	public void setItems(List<OrderItem> items) {
		this.items = items;
	}
	public Order(int id, String orderNr, Date orderDate, String custName, String custTaxNr, String custAddress,
			String custBankAccount, List<OrderItem> items) {
		super();
		this.id = id;
		this.orderNr = orderNr;
		this.orderDate = orderDate;
		this.custName = custName;
		this.custTaxNr = custTaxNr;
		this.custAddress = custAddress;
		this.custBankAccount = custBankAccount;
		this.items = items;
	}
	public Order() {
		super();
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderNr=" + orderNr + ", orderDate=" + orderDate + ", custName=" + custName
				+ ", custTaxNr=" + custTaxNr + ", custAddress=" + custAddress + ", custBankAccount=" + custBankAccount
				+ ", items=" + items + "]";
	}
	
	
}
