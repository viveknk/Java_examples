package com.viveknk.nonaccessmods.finals;

public class FinalVariable {

	public static void main(String[] args) {
		
		int i = 10;
		final int j = 20;
		
		i++;
		
		//j++;
		//not allowed since "j" is declared as final
		
		incrementDisp();
		
		disp(j);
		
		//for display we can pass different values from here, only after the value is passed, it is a final
		display(10);
		
		display(20);
		
		display(30);
	}
	
	public static void incrementDisp() {
		
		int j = 3;
		//now this is a new variable "j" in this method scope and not final. Hence, we can change
		j++;
		System.out.println("j++ = "+ j);
	}
	
	public static void disp(int j) {
		
		System.out.println(j++);
	}
	
	public static void display(final int k) {
		
		System.out.println("k="+k);
		//System.out.println("k="+k++);
		//not allowed since the value "k" passed to this method is declared final in the method signature declaration
	}
}
