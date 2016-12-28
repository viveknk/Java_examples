package com.viveknk.first;

public class Returns {

	public static void main(String[] args) {
		
		System.out.println(getInt());
		System.out.println(getLong());
		System.out.println(getString());
		getNothing();
	}
	
	public static int getInt() {
		return 100;
	}
	
	public static long getLong() {
		return 100;
	}
	
	public static String getString() {
		return "100";
	}
	
	public static void getNothing() {
		
		System.out.println("100 is printed within - not returned");
	}
}
