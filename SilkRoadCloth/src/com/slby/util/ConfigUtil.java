package com.slby.util;

import java.util.ResourceBundle;

/**
 * 项目参数工具类
 * 
 * @author sp
 * 2017.7.22
 * 此类主要用于获取.property文件里面的数据
 * 
 */
public class ConfigUtil {

	private static final ResourceBundle bundle = java.util.ResourceBundle.getBundle("database");

	/**
	 * 获得sessionInfo名字
	 * 
	 * @return
	 */
	public static final String getSessionInfoName() {
		return bundle.getString("sessionInfoName");
	}

	/**
	 * 通过键获取值
	 * 
	 * @param key
	 * @return
	 */
	public static final String get(String key) {
		return bundle.getString(key);
	}
	
	
	public static void main(String args[]){
		ConfigUtil u = new ConfigUtil();
		String i = u.get("sessionInfoName");
		System.out.println(i);
	}

}
