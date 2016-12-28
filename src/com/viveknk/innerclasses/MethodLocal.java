package com.viveknk.innerclasses;

public class MethodLocal {

	private int i = 9;
	
	public void innerMethod() {
		class InnerClass {
			public void getValue() {
				System.out.println("value of i = " + i);
			}
		}
		
		InnerClass i1 = new InnerClass();
		i1.getValue();
	}
	
	public static void main(String[] args) {
		
		MethodLocal ml = new MethodLocal();
		ml.innerMethod();
	}
}
