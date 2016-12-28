package com.viveknk.boxwrap;

public class Boxing {

	void disp(Integer i) {
		
		System.out.println("i is instance of Integer? - "+(i instanceof Integer));
		
		System.out.println("i = "+i); //unboxed back to int
		
		System.out.println("i = "+i.intValue());
	}
	
	
	
	//If you uncomment this, then this method is preferred over the above
	//widening is preferred than boxing/unboxing
	
	/*void disp(long i) {
		
		System.out.println(" i = "+i);
	}*/
	
	public static void main(String[] args) {
		
		Boxing bx = new Boxing();
		bx.disp(100);
		//100 is boxed from int to Integer

		//long cannot be boxed to Integer
		//bx.disp(100L);
		
		Integer[] num2 = new Integer[]{ 1, 2, 3, 4, 5};
		
		for(int n : num2) {
			System.out.println(n);
		}
	}
}
