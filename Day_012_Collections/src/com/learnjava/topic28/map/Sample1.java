package com.companyname.democollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Sample1 {

	public static void main(String[] args) {
	/*	String paragraph ="Inserts all of the elements in the specified collection into this list at the specified position .Shifts theelement currently at that position and any subsequentelements to the right.The new elementswill appear in this list in the order that they are returned by thespecified collection's iterator.The behavior of this operation isundefined if the specified collection is modified while theoperation is in progress.";
	String[] words =paragraph.split(" ");
	System.out.println(words.length);
	
	List wordList = new ArrayList(Arrays.asList(words));
	System.out.println(wordList);
	
	Set uniquevalues =new HashSet();
	
	uniquevalues.addAll(wordList);
	System.out.println(uniquevalues.size());
	System.out.println(uniquevalues);*/
	
		
		String str = "Helloworld";
		
		System.out.println(new StringBuilder(str).reverse());
		
		System.out.println(str.length());
		
		for( int index=str.length()-1;index>=0;index--){
			System.out.print(str.charAt(index));
			
		}
		
		Stack strStack = new Stack();
		
		for(int index=0;index<str.length();index++){
			strStack.push(str.charAt(index));
		}
		
		
		
	
	}

}