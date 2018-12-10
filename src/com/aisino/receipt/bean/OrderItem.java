/*
 * All rights Reserved, Copyright (C) Aisino LIMITED 2018
 * FileName: OrderItem.java
 * Version:  $Revision$
 * Modify record:
 * NO. |     Date       |    Name         |      Content
 * 1   | 2018年12月6日        | Aisino)JackWei    | original version
 */
package com.aisino.receipt.bean;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * class name:OrderItem <BR>
 * class description: please write your description <BR>
 * Remark: <BR>
 * @version 1.00 2018年12月6日
 * @author Aisino)weihaohao
 */
public class OrderItem implements Cloneable{
	private int id;				//自增id
	private String prodCode;	//商品编码
	private String prodName;	//商品名称
	private String spec;		//商品类型
	private String unit;		//商品单位
	private double price;		//商品单价
	private double quantity;	//商品个数
	private double value;		//商品不含税价
	private double taxRate;		//商品税率
	private double taxValue;	//商品含税价
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public double getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}
	public double getTaxValue() {
		return taxValue;
	}
	public void setTaxValue(double taxValue) {
		this.taxValue = taxValue;
	}
	public OrderItem(int id, String prodCode, String prodName, String spec, String unit, double price, double quantity,
			double value, double taxRate, double taxValue) {
		super();
		this.id = id;
		this.prodCode = prodCode;
		this.prodName = prodName;
		this.spec = spec;
		this.unit = unit;
		this.price = price;
		this.quantity = quantity;
		this.value = value;
		this.taxRate = taxRate;
		this.taxValue = taxValue;
	}
	public OrderItem() {
		super();
	}
	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", prodCode=" + prodCode + ", prodName=" + prodName + ", spec=" + spec
				+ ", unit=" + unit + ", price=" + price + ", quantity=" + quantity + ", value=" + value + ", taxRate="
				+ taxRate + ", taxValue=" + taxValue + "]";
	}
	public Object clone() {
		OrderItem o = null;
		Logger logger = Logger.getLogger("lavasoft"); 
		logger.setLevel(Level.INFO); 
        try {
            o = (OrderItem) super.clone();
        } catch (CloneNotSupportedException e) {
        	logger.log(Level.INFO, e.toString());
        }
	   return o;
	}
	
}
