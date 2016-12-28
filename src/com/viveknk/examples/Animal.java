package com.viveknk.examples;

public class Animal {

	private String name = "no-name-given";
	
	public String owner = "No-owner";
	
	private Collar collar;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Collar getCollar() {
		return collar;
	}
	
	public void setCollar(Collar collar) {
		this.collar = collar;
	}
	
	public void eat() {
		System.out.println("Animal eating food...");
	}
	
	public void makeNoise() {
		System.out.println("noise.. noise...");;
	}
}
