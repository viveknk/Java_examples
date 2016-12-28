package com.viveknk.examples;

public class Dog extends Animal {
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public void eat() {
		System.out.println("I like Cat flesh.. Yum... Yum...");
	}
	
	public void makeNoise() {
		System.out.println("bark.. bark...");
	}
	
	public void catchThief() {
		System.out.println("Bingo!! I got his balls!!");
	}
}
