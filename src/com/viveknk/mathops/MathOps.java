package com.viveknk.mathops;

public class MathOps {

	public static void main(String[] args) {
		
		int a = 10;
		int b = -10;
		
		double res = Math.pow(a, 2);
		
		System.out.println("square of 10 = "+ res);
		
		System.out.println("area of circle with radius 10 = "+(Math.PI*res));
		
		System.out.println("abs of -10 = "+Math.abs(b));
		
		System.out.println("max of a & b = "+Math.max(a,b));
		
		System.out.println("min of a & b = "+Math.min(a,b));
		
		System.out.println("square root of 10 = "+Math.sqrt(a));
		
		System.out.println("cube root of 10 = "+Math.cbrt(a));
	}
}
