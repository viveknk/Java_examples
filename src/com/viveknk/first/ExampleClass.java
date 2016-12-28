package com.viveknk.first;

public class ExampleClass {

	//this is a class variable - also called as class member
	String name = "Unknown";
	
	//main method that executes as initial thread
	public static void main(String[] args) {
		
		//create an object of type ExampleClass
		//ec is the reference variable of this object
		ExampleClass ec = new ExampleClass();
		
		//set the name property of the object referred by "ec" variable
		ec.name = "viveknk";
		
		//print the name to the console that was set above
		System.out.println("The name is : "+ ec.name);
		
	}
}
