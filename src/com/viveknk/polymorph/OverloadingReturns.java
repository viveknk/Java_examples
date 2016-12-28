package com.viveknk.polymorph;

public class OverloadingReturns {

	public static void main(String[] args) {
		
		System.out.println(getInt());
		System.out.println(getInt(10));
		System.out.println(getInt(100));
		getInt("");
	}
	
	public static int getInt() {
		return 100;
	}
	
	//overloaded method with long return type
	public static long getInt(int i) {
		return i+100;
	}
	
	//overloaded method with string return type
	public static String getInt(long i) {
		return String.valueOf(i+100);
	}
	
	//overloaded method with void return type
	public static void getInt(String s) {
		//nothing to return
	}
}
