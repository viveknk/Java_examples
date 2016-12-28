package com.viveknk.innerclasses;

public class InnerVariableControl {
	
	private int data=30;//instance variable
	
	 void display(){  
	  
		 final int value=50;//local variable must be final till jdk 1.7 only  
		 class Local{  
		   void msg(){
			   System.out.println(value);
		   }  
		 }  
		 Local l=new Local();  
		 l.msg();  
	 }
	 
	 public static void main(String args[]){  
		 
		 InnerVariableControl obj=new InnerVariableControl();  
		 obj.display();  
	 }
}
