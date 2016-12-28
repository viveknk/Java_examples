package com.viveknk.operators;

public class ArithmeticOpers {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 20;
		int k = 100;
		
		System.out.println("i = "+i);
		System.out.println("j = "+j);
		System.out.println("k = "+k);
		
		int add = i + j;
		int sub = j - i;
		int mul = i * j;
		int div = j / i;
		int mod = k % i;
		
		System.out.println("i + j = "+add);
		
		System.out.println("j - i = "+sub);
		
		System.out.println("i * j = "+mul);
		
		System.out.println("j / i = "+div);
		
		System.out.println("k / i = "+mod);
		
		i++;
		
		System.out.println("i++ = "+ i);
		
		++i;
		
		System.out.println("++i = "+ i);
		
		k--;
		
		System.out.println("k-- = "+ k);
		
		--k;
		
		System.out.println("--k = "+ k);
	}
}
