package com.viveknk.nonaccessmods.finals;

public class Constants {

	//declaring a constant with static & final - public if we want to use it elsewhere
	
	public static final int MY_CONSTANT_VAL = 100; 
	
	public static void main(String[] args) {
		
		System.out.println("Final val = " + MY_CONSTANT_VAL);

		//MY_CONSTANT_VAL++;
		//Not allowed - since this is a constant
		
		System.out.println("Final val = " + MY_CONSTANT_VAL);
		
	}
}

class ConstantUser {
	
	public static void main(String[] args) {
		
		//we can use the constant that is declared in another class - because it is a constant :)
		System.out.println("Final val = " + Constants.MY_CONSTANT_VAL);
	}
}