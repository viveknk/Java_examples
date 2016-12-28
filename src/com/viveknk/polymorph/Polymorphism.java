package com.viveknk.polymorph;

class Animal {
	
	void eat(){
    	System.out.println("eating");
	}
}

class Dog extends Animal{        
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
  
class BabyDog extends Dog{        
    
	void eat(){
    	System.out.println("drinking milk");
	}  
}

public class Polymorphism {
	
	public static void main(String args[]){  
        Animal a1,a2,a3;  
        a1=new Animal();  
        a2=new Dog();  
        a3=new BabyDog();  
  
        a1.eat();  
        a2.eat();  
        a3.eat();  
	}  
}