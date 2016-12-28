package com.viveknk.examples;

public class Collar {

	private int collarLength;
	
	private String color;

	public int getCollarLength() {
		return collarLength;
	}

	public void setCollarLength(int collarLength) {
		this.collarLength = collarLength;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return " having a "+ color +" collar with length of " + collarLength + " feet";
	}
}
