package com.viveknk.innerclasses;

abstract class Person {
	abstract void eat();  
}

interface Human {  
	void eat();  
}

public class Anonymous {

	public static void main(String[] args) {
		
		Person p = new Person() {
			void eat(){
				System.out.println("eating nice fruits");
			}  
		};
		
		p.eat();
		
		Human h = new Human() {
			public void eat(){
				System.out.println("wow i'm eating nice fruits");
			}  
		};
		
		h.eat();
	}
}
