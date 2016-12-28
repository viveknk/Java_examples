package com.viveknk.first;

public class PassBy {

	int i=10; //class variable to be used for increment using object reference
	
	public int inc(int j) { //value to be incremented is passed. return mandatory
		j++;
		return j;
	}
	
	public void inc(PassBy pb) { //reference of object is passed. return not required
		pb.i++;		
	}
	
	public static void main(String[] args) {
		
		PassBy obj = new PassBy();
		
		System.out.println("First, pass by value...");
		System.out.println(obj.inc(100)); //pass value
		System.out.println(obj.i); //pass value from the object - not the reference of the object
		
		System.out.println("Now, pass by reference...");
		
		obj.inc(obj); //pass object reference
		System.out.println(obj.i);
	}
}
