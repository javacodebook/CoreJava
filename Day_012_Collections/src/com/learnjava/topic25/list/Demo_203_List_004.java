package com.learnjava.topic25.list;

// Duplicates are allowed here ,

import java.util.ArrayList;

public class Demo_203_List_004 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(110);
		list.add("hello");
		list.add(10);
		list.add(12.23f);
		list.add("hello");
		list.add(10);
		list.add(12.23f);
		list.add("hello");
		list.add(10);
		list.add(12.23f);
		System.out.println(list);
	}

}
