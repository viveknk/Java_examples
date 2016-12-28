package com.viveknk.inheritane;

public class Orange extends Fruit {

	private String color = "orange";
	private float weight = 0.35f;
	
	private void dispColor() {
		System.out.println("color is : "+ color);
	}
	
	public static void main(String[] args) {
		
		Orange or = new Orange();
		or.displayWeight();
		or.dispColor();
	}
}
