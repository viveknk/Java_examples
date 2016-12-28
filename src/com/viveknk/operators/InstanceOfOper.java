package com.viveknk.operators;

public class InstanceOfOper {

	public static void main(String[] args) {
		
		String name = "viveknk";
	    // following will return true since name is type of String
	    boolean result = name instanceof String;  
	    System.out.println( result );
	    
	    Vehicle a = new Car();
	    boolean result2 =  a instanceof Car;
	    System.out.println( result2 );
	    
	    
	    //following is not possible since Luggage and Car are not in same inheritance tree
	    
	    /*Luggage l = new Luggage();
	    boolean result3 =  l instanceof Car; //not possible since Luggage and Car are not in same inheritance tree 
	    System.out.println( result3 );*/
	}
}


class Vehicle {}

class Car extends Vehicle {}

class Luggage {}