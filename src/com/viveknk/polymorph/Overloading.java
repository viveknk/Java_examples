package com.viveknk.polymorph;

public class Overloading {
	
	public static void main(String[] args) {
	
		MyDog d = new MyDog();
		
		//calling the overridden method of MyDog
		d.eat();
		
		//calling the overloaded method eat(String) of MyDog
		d.eat("meat!");
	}
}

class MyAnimal {  
    
	   void eat(){
     	System.out.println("eating");
     }  
}

class MyDog extends Animal{  
     
 	//overridden method
 	//overriding the parent Animals eat() method
 	void eat(){
 		System.out.println("eating fruits");
 	}
 	
 	//overloaded method
 	//overloading the other eat methods of dog
 	void eat(String food){
 		System.out.println("eating"+food);
 	}
}