package com.viveknk.inheritane;

public class Fruit {

	private float weight = 1.24f;
	public String family = "fruits";
	
	public void displayWeight() {
		System.out.println("Fruit Weight is : "+weight+" kgs");
	}
	
	public static void main(String[] args) {
		
		Fruit f = new Fruit();
		f.displayWeight();
		
		f.weight = 2.45f;
		f.displayWeight();
	}
}
