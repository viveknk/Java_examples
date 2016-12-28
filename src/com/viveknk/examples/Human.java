package com.viveknk.examples;

public class Human {
	
	public static void main(String[] args) {
		
		Animal first = new Dog();
		
		first.setName("Jimmy");
		first.owner = "Rob";
		
		Collar c1 = new Collar();
		c1.setCollarLength(10);
		c1.setColor("RED");
		
		first.setCollar(c1);
		
		Animal second = new Cat();
		
		second.setName("Lucy");
		second.owner = "Bob";
		
		Collar c2 = new Collar();
		c2.setCollarLength(5);
		c2.setColor("BLUE");
		
		second.setCollar(c2);
		
		System.out.println("First animal's name is : "+first.getName());
		System.out.println("Owner is : "+first.owner);
		System.out.println("First animal's collar is "+first.getCollar());
		
		//isntanceof checks if an Object is of that Class type or not
		if(first instanceof Dog) {
			
			System.out.println("First animal is a dog!!");
			
		} else if(first instanceof Cat){
			
			System.out.println("First animal is a cat!!");
		
		} else {
			
			System.out.println("First animal is unknown!!");
			
		}
		//without typecasting - Animal class methods will be called
		//but at runtime the corresponding methods of Dog will execute - It's all Polymorphism folks!!
		first.eat();
		first.makeNoise();
		//cannot call Dog specific methods that are not defined in Animal class
		//first.catchThief(); //It will say "catchThief is undefined in Animal class" 
		
		//down-casting the first animal to Dog - now Dog specific methods could be called
		Dog myDog = (Dog)first;
		System.out.println("Dogs Owner is : "+myDog.owner);
		myDog.eat();
		myDog.makeNoise();
		myDog.catchThief(); // Now we can call this since now this is explicitly known as Dog by the reference "myDog"
		
		System.out.println("\n---------------------------------------------------------------------------\n");
		
		System.out.println("Second animal's name is : "+second.getName());
		System.out.println("Owner is : "+second.owner);
		System.out.println("Second animal's collar is "+second.getCollar());
		
		//isntanceof checks if an Object is of that Class type or not
		if(second instanceof Dog) {
			
			System.out.println("Second animal is a dog!!");
			
		} else if(second instanceof Cat){
			
			System.out.println("Second animal is a cat!!");
		
		} else {
			
			System.out.println("Second animal is unknown!!");
			
		}
		//without typecasting - Animal class methods will be called
		//but at runtime the corresponding methods of Cat will execute - It's all Polymorphism folks!!
		second.eat();
		second.makeNoise();
		
		//down-casting the first animal to Cat - now Cat specific methods could be called
		Cat myCat = (Cat)second;
		System.out.println("Cats Owner is : "+myCat.owner);
		myCat.eat();
		myCat.makeNoise();
		myCat.attackMySister(); // Now we can call this since now this is explicitly known as Cat by the reference "myCat"
		//Statutory Warning: Don't try the above stunt at home.. That might be your cats last day! :)
	}
}
