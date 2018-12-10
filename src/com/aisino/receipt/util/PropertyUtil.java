package com.aisino.receipt.util;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Test;

/**
 * class name:PropertyUtil <BR>
 * class description: 读取配置文件工具类 <BR>
 * Remark: <BR>
 * @version 1.00 2013-12-26
 * @author JFTT)FuXiaofeng
 */
public class PropertyUtil {
	
	private PropertyUtil() {
	    throw new IllegalStateException("Utility class");
	}

	
	/** 读取src下configure.properties配置文件内容 */
	private static final  String CONFIGURE_LOCATION = "configure.properties";
	/** 接收Properties内容 */
	private static final  Properties property = new Properties();
	
	/**
	 * Method name: getConfigureProperties <BR>
	 * Description: 读取src下第三方配置文件thirdConfig.properties配置文件内容 <BR>
	 * Remark: <BR>
	 * @param propertyName
	 * @return String<BR>
	 */
	@Test
	public static String getConfigureProperties(String propertyName) {
		Logger logger = Logger.getLogger("context"); 
		logger.setLevel(Level.INFO); 
		try {
			property.load(PropertyUtil.class.getClassLoader().getResourceAsStream(CONFIGURE_LOCATION));
			String result = property.getProperty(propertyName);
			if (null != result && !"".equalsIgnoreCase(result)) {
				return result.trim();
			} else {				
				return null;
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, e.getMessage());
			logger.warning(e.getMessage());
			return null;
		} 
	}

}