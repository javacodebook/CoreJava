package com.companyname.demo2.constructorstypes;
/*
 * Example of parameterized constructor 
 */

class Car2 {

	public String name;
	
	 Car2(String carName) {
		 System.out.println("I am Ready ....!!! My name is  :- Value from JVM"+name+ " car");
		 name = carName;
		System.out.println("I am Ready ....!!! My name is  :-"+name+ " car");
		
	}

	public void drive() {
		System.out.println("Drving the " + name + "Car....!!!");

	}

}

public class Demo_Costructors_03_ConstructorTypes {

	public static void main(String[] args) {

		Car2 audi = new Car2("Audi");
		System.out.println(audi.name);
		audi.drive();

	}

}
