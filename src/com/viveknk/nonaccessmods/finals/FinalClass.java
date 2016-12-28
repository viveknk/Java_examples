package com.viveknk.nonaccessmods.finals;

import javax.management.ImmutableDescriptor;

//If the class decalration is "final" - then we cannot subclass it
//i.e. this is now an immutable class
public final class FinalClass {
	
	String name = "viveknk";
	
	public void display() {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		FinalClass im = new FinalClass();
		im.display();
	}
}


//This is not possible. If you uncomment the following it will throw error 

/*class NotPossible extends FinalClass {
	
}*/
