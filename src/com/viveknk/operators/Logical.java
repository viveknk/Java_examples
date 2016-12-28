package com.viveknk.operators;

public class Logical {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 20;
		int k = 100;
		
		System.out.println("i = "+i);
		System.out.println("j = "+j);
		System.out.println("k = "+k);
		
		if(i==10 && j==20) {
			System.out.println("i is 10 and j is 20");
		}
		
		if(i<j || k<j) {
			System.out.println("either i is lesser than j or k is lesser than j");
		}
		
		if(i!=0) {
			System.out.println("i is not equal to 0");
		}
		
		if(j!=0) {
			System.out.println("j is not equal to 0");
		}
		
		if(!(i==0 && j==0)) {
			System.out.println("It is NOT TRUE that i & j is equal to 0");
		}
	}
}
