package com.companyname.demo2.List;
// array list accept the null values 

import java.util.ArrayList;

public class Demo_List_5 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("hello");
		list.add(10);
		list.add(12.23f);
		list.add(null);
		list.add(null);
		list.add(null);
		
		System.out.println("list  size :"+list.size());
		
		System.out.println("list  size :"+list);
		
		
	}

}