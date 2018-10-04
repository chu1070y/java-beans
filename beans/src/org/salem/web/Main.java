package org.salem.web;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) throws Exception{
		
		Map<String,Object> param = new HashMap<>();
		
		param.put("name", "Tascioni");
		param.put("age", 50);
		param.put("married", true);
		
		Class clz = Class.forName("org.salem.domain.Member");
		
		PropertyDescriptor[] props = Introspector.getBeanInfo(clz).getPropertyDescriptors();
		
		for(PropertyDescriptor p : props) {
			System.out.println("1-------"+p.getName());
			Method setter = p.getWriteMethod();
			System.out.println("2----------"+setter);
		}
		
	}

}
