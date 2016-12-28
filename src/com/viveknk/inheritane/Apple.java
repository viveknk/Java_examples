package com.viveknk.inheritane;

public class Apple extends Fruit {

	private String color = "red";
	private float weight = 0.67f;
	
	private void dispColor() {
		System.out.println("color is : "+ color);
	}
	
	public static void main(String[] args) {
		
		Apple or = new Apple();
		or.displayWeight();
		or.dispColor();
	}
}
