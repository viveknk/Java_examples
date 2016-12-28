package com.viveknk.operators;

public class AssignmentOpers {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 20;
		int k = 10;
		int m = 5;
		
		int res = 50;
		
		res += i;
		System.out.println("res = "+res);
		
		res -= j;
		System.out.println("res = "+res);
		
		res *= k;
		System.out.println("res = "+res);
		
		res /= m;
		System.out.println("res = "+res);
		
		res %= 21;
		System.out.println("res = "+res);
		
		res &= 84;
		System.out.println("res = "+res);
		
		res ^= 2000;
		System.out.println("res = "+res);
		
		res |= 3500;
		System.out.println("res = "+res);
		
		res >>= 1;
		System.out.println("res = "+res);
		
		res <<= 1;
		System.out.println("res = "+res);
		
	}
}
