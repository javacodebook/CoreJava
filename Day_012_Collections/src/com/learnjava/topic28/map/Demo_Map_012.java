package com.learnjava.topic28.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Replace method 
public class Demo_Map_012 {

	public static void main(String[] args) {
		Map map =new HashMap();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		map.put(6, "F");
		map.put(null, "D");
		System.out.println(map.replace(1, "a"));
		
		System.out.println(map);
		
	}

}
