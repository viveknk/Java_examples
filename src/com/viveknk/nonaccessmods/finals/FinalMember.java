package com.viveknk.nonaccessmods.finals;

import com.viveknk.encap.MyPojo;

public class FinalMember {

	final String name = "Chennai";
	
	final MyPojo obj = new MyPojo();
	
	public final void display() {
		System.out.println("Hi, I'm from "+name);
	}
	
	public static void main(String[] args) {
		
		FinalMember fm = new FinalMember();
		//fm.name = "Madras";
		//Cannot uncomment the above since modifying a final variable is not allowed
		
		//fm.obj = new MyPojo();
		// this is not possible, since the reference obj is modified but it is declared as final
		
		// But, we can change the properties of the same object. the reference only is final.
		fm.obj.setName("Jill"); 
		
	}
}

class AnotherClass extends FinalMember {
	
	//not allowed since we could not override a final method of parent class
	/*public void display() {
		System.out.println("Hi, I'm from "+name);
	}*/
}