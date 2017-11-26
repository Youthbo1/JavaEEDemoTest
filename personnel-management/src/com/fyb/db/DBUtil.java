package com.fyb.db;

import java.util.HashMap;
import java.util.Map;

import com.fyb.bean.Emp;

public class DBUtil {
	public static Map<String, Emp> map = new HashMap<>();
	static {
		map.put("101", new Emp("101", "AA", "123456", "AA@imooc.com"));
		map.put("102", new Emp("102", "BB", "123456", "BB@imooc.com"));
		map.put("103", new Emp("2", "CC", "2", "CC@imooc.com"));
		map.put("104", new Emp("104", "DD", "123456", "DD@imooc.com"));
		map.put("1", new Emp("1", "ff", "1", "ff@imooc.com"));
	}

	// 判断用户名和密码是否正确
	public static boolean selectEmpByAccountAndPassword(Emp emp) {
		boolean flag=false;
		for(String key:map.keySet()) {
			Emp e=map.get(key);
			if(emp.getAccount().equals(e.getAccount())
					&& emp.getPassword().equals(e.getPassword())) {
				flag=true;
			}
				
		}
		return flag;
	}
}
