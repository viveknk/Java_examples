package com.viveknk.exceptions;

public class NumericExceptionHandling {

	public static void main(String[] args) {
		
		String n = "hundred";
		try {
			Integer.parseInt(n);
		} catch(IllegalArgumentException ex) {
			System.out.println("IllegalArgumentException caught");
			ex.printStackTrace();
		}
		
		try {
			Integer.parseInt(n);
		} catch(NumberFormatException ex) {
			System.out.println("NumberFormatException caught");
			ex.printStackTrace();
		} catch(IllegalArgumentException ex) {
			System.out.println("IllegalArgumentException caught");
			ex.printStackTrace();
		}
	}
}
