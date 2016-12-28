
package com.viveknk.nonaccessmods.abstracts;

abstract class Bike{
	Bike(){
            System.out.println("bike is created");
    }  
   
   abstract void run();  
   
   void changeGear(){  
        System.out.println("gear changed");
    }  
}  
  

class Honda extends Bike{
	
	void run(){
            System.out.println("running safely..");
	}  
}

class AbstractClass{  

	public static void main(String args[]){  
        
		//Bike obj = new Bike(); //will give error - abstract class cannot be initiated
		Bike obj = new Honda();  
        obj.run();  
        obj.changeGear();  
    }  
}  
   

