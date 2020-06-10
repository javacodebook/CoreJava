/* We Know that super class public methods are will be visible to sub class 
 * 
 * 				CLASS :-  Demo_Object_00 -----> Methods :- getPersonName(),getPersonAge()
 * 								|
 * 
 * 				CLASS :-  Demo_Object_01 -----> Methods :- getPersonName(),getPersonAge() and its own methods .
 * 
 * */
package com.companyname.demo2.objectclass.introduction;

class Demo_Object_00 {

	private String personName;
	private int personAge;
	
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	

}
	
public class Demo_Object_001  extends Demo_Object_00 {
	
	
   // Press Ctrl + o   2 times :- Just observe only super class methods are avaliable in sub class .
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
