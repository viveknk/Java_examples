package com.viveknk.polymorph;

class Creature {
	
	int eat(){
    	System.out.println("eating");
    	return 0;
	}
	
	public Creature getInstance() {
		return new Creature(); 
	}
}

class Tiger extends Creature {        
    //overridden method
	//overriding the parent Animals eat() method but with different return type
	//Hence, not allowed - Only covariant return is allowed
	/*long eat(){
		System.out.println("eating fruits");
		return 1;
	}*/

	//overridden method with a covariant return - ie. Tiger - subclass of Creature
	public Tiger getInstance() {
		return new Tiger(); 
	}
	
}

public class OverridingReturns {
	
	public static void main(String args[]){  
        
		Creature a1,a2;
		
        a1=new Creature();  
        a2=new Tiger();
  
        a1.eat();
        a2.eat();
        
        Creature newa1,newa2;
        newa1 = a1.getInstance();
        newa2 = a2.getInstance();
        
        System.out.println("newa1 is a Creature? : " + (newa1 instanceof Creature));
        System.out.println("newa1 is a Tiger? : " + (newa1 instanceof Tiger));
        System.out.println("newa2 is a Creature? : " + (newa2 instanceof Creature));
        System.out.println("newa2 is a Tiger? : " + (newa2 instanceof Tiger));
	}
}
