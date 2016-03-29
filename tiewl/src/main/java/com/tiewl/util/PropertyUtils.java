package com.tiewl.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

public class PropertyUtils {
	/**
	 * 拦截的请求的配置文件
	 * @return
	 * @throws IOException
	 */
	public static List<String> getKeylist() throws IOException{
		Properties pro = new Properties();
		List<String> list = new ArrayList<String>();
		try {
		    InputStream inStr = PropertyUtils.class.getClassLoader().getResourceAsStream("interceptor.properties");
		    pro.load(inStr);
		    
		    Enumeration enu=pro.propertyNames();
		    while(enu.hasMoreElements()){
		        String key = (String)enu.nextElement();
		        list.add(key);
		    }
		    
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		return list;
	} 
	
}
