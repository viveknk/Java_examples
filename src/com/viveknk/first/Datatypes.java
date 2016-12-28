package com.viveknk.first;

import com.viveknk.utils.Print;

public class Datatypes {

	int age;
	long salary;
	float weight;
	double taxPaid;
	String name;
	boolean isHappy;
	
	public static void main(String[] args) {

		Datatypes dt = new Datatypes();
		
		System.out.println("name 	: " + dt.name);
		System.out.println("age 	: " + dt.age);
		System.out.println("salary 	: " + dt.salary);
		System.out.println("weight 	: " + dt.weight);
		System.out.println("taxPaid : " + dt.taxPaid);
		System.out.println("isHappy : " + dt.isHappy);
		
		Print.printbr();
		
		dt.name = "Govind";
		dt.age = 25;
		dt.salary = 35000;
		dt.weight = 75.53F; // a suffix "F" / "f" is required when assigning a value for float variable
		dt.taxPaid = 5764.9765489;
		//dt.taxPaid = 5764.9765489d; // for double the suffix "D" / "d" is optional
		
		System.out.println("name 	: " + dt.name);
		System.out.println("age 	: " + dt.age);
		System.out.println("salary 	: " + dt.salary);
		System.out.println("weight 	: " + dt.weight);
		System.out.println("taxPaid : " + dt.taxPaid);
		System.out.println("isHappy : " + dt.isHappy);
	}
	
}
