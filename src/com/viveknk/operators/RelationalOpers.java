package com.viveknk.operators;

public class RelationalOpers {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 20;
		int k = 10;
		int m = 100;
		
		System.out.println("i = "+i);
		System.out.println("j = "+j);
		System.out.println("k = "+k);
		System.out.println("m = "+m);
		
		if(i==10) {
			System.out.println("i is equal to 10");
		}

		if(i==k) {
			System.out.println("i and k are equal");
		}
		
		if(i<j) {
			System.out.println("i is lesser than j");
		}
		
		if(i<=j) {
			System.out.println("i is lesser than or equal to j");
		}
		
		if(m>i) {
			System.out.println("m is greater than i");
		}
		
		if(m>=i) {
			System.out.println("m is greater than or equal to i");
		}
		
		if(i!=j) {
			System.out.println("i is not equal to j");
		}
	}
}
