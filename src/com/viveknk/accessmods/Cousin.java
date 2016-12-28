package com.viveknk.accessmods;

public class Cousin {

	public static void main(String[] args) {
		
		Parents p = new Parents(); //Parent class is public. So i can create an object of that type here
		
		System.out.println("I'm a relation of the child and their home wifi password is " + p.homewifipassword); 
		// this is accessible since it is protected - Anyone who is in the same package & also the descendants of "Parents" can access this
		
		
		
	}

}
