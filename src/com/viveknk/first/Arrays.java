package com.viveknk.first;

import com.viveknk.utils.Print;

public class Arrays {

	public static void main(String[] args) {
		
		//initializing an array of primitive type
		int[] num = { 1, 2, 3, 4, 5};
		
		int i = 0;
		
		//looping through the array
		while(i<num.length) {
			System.out.println(num[i++]);
		}
		
		Print.printbr();
		
		//initializing an array of pojos
		Gadget[] num2 = new Gadget[]{ new Gadget("Mobile"), new Gadget("PC"), new Gadget("Tablet")};
		
		i = 0;
		
		//iterating the pojo array
		while(i<num2.length) {
			System.out.println(num2[i++].name);
		}
		
		Print.printbr();
		
		i=0;
		
		//reverse iteration of pojo array
		while(i<num2.length) {
			int revInd = num2.length-i-1;
			num2[i++].name = num2[revInd].name;
		}
		
		//Can you see that the array is reversed now
		
		System.out.println("Lets, print the revered array...\n");
		
		i = 0;
		
		while(i<num2.length) {
			System.out.println(num2[i++].name);
		}
		
		Print.printbr();
	}
}

class Gadget {
	
	public String name;
	
	Gadget(String name) {
		this.name = name;
	}
}