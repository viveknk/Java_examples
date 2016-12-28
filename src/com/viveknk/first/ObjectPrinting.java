package com.viveknk.first;

import com.viveknk.utils.Print;

public class ObjectPrinting {
	
	public static void main(String[] args) {
		
		ExampleClass2 ex2 = new ExampleClass2();
		System.out.println(ex2.toString());
		System.out.println(ex2);
		
		Print.printbr();
		
		ExampleClass3 ex3 = new ExampleClass3();
		System.out.println(ex3.toString());
		System.out.println(ex3);
		
		Print.printbr();
		
		ExampleClass4 ex4 = new ExampleClass4();
		System.out.println(ex4);
		ex4.msg = "Thank you all!!";
		System.out.println(ex4);
	}
}

class ExampleClass2 {

	private String msg = "Welcome";
	
	public String toString() {
		return "Thank you!!";
	}
}


class ExampleClass3 {
	
	private String msg = "Welcome";
}

class ExampleClass4 {

	protected String msg = "Welcome";
	
	public String toString() {
		return msg;
	}
}
