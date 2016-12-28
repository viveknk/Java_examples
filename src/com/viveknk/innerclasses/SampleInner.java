package com.viveknk.innerclasses;

public class SampleInner {
	
	public static void main(String[] args) {
		
		TestMemberOuter1.callMe();
		
		Outer.callMe();
	}
}

class TestMemberOuter1 {  

	private int data=30;  
	
	class Inner{  
	  void msg(){
		  System.out.println("data is "+data);
	  }  
	}
	
	public static void callMe(){  
		
		TestMemberOuter1 obj=new TestMemberOuter1();  
		TestMemberOuter1.Inner in=obj.new Inner();  
		in.msg();  
	}
}



class Outer {
	
	class Outer$Inner {
	    
		final Outer this$0;  
	    
		Outer$Inner(){
			super();  
	        this$0 = Outer.this;  
	    }
		
	    public void msg() {  
	        System.out.println((new StringBuilder()).append("data is ")  
	                    .append(Outer.this).toString());  
	    }
	}
	
	public static void callMe(){
		
		Outer out = new Outer();
		
		out.new Outer$Inner().msg();
	}
}