package com.viveknk.gc;

public class GarbageCollection {
	
	
	public void finalize(){
		//called when an object of this class is collected by the GC 
		System.out.println("object is garbage collected");
	}
	
	public static void main(String[] args) {
		
		GarbageCollection s1=new GarbageCollection();  
		GarbageCollection s2=new GarbageCollection();
		
		s1=null;
		s2=null;
		
		System.gc();
		
		//we will do something for some time - so we can notice that the garbage is collected
		
		for(int i=1;i<100;i++) {
			System.out.print(i+"->");
		}
	}
}
