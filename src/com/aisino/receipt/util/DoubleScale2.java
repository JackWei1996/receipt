/*
 * All rights Reserved, Copyright (C) Aisino LIMITED 2018
 * FileName: DoubleScale2.java
 * Version:  $Revision$
 * Modify record:
 * NO. |     Date       |    Name         |      Content
 * 1   | 2018年12月6日        | Aisino)JackWei    | original version
 */
package com.aisino.receipt.util;

import java.math.BigDecimal;

/**
 * class name:DoubleScale2 <BR>
 * class description: please write your description <BR>
 * Remark: <BR>
 * @version 1.00 2018年12月6日
 * @author Aisino)weihaohao
 */
public class DoubleScale2 {
	private DoubleScale2() {
	    throw new IllegalStateException("Utility class");
	}

	 /**
	 * Method name: doubleRound <BR>
	 * Description: double向上取n位小数 <BR>
	 * Remark: <BR>
	 * @param f
	 * @param n
	 * @return  double<BR>
	 */
	public static double doubleRound(double f, int n) {
         BigDecimal bg = BigDecimal.valueOf(f);
         return  bg.setScale(n, BigDecimal.ROUND_HALF_UP).doubleValue();
     }
}
