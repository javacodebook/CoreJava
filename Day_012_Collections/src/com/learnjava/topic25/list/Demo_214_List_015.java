package com.learnjava.topic25.list;


// AddAll Example 

import java.util.ArrayList;

public class Demo_214_List_015 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		ArrayList list3 = new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		 
		System.out.println(list1);
		
		list2.add(8);
		list2.add(9);
		list2.add(10);
		
		System.out.println(list2);
		
		list1.addAll(list2);
		System.out.println(list1);
		
		list3.add(-2);
		list3.add(-1);
		list3.add(0);
		
		list1.addAll(0, list3);
		System.out.println(list1);
		
		
	
	}

}
