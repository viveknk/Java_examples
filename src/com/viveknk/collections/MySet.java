package com.viveknk.collections;

import java.util.HashSet;
import java.util.Set;

public class MySet {

	public static void main(String[] args) {
		
		Set<String> elements = new HashSet<>();
		
		boolean b = elements.add("Android");
		System.out.println("new element? : "+ b);
		b = elements.add("Java");
		System.out.println("new element? : "+ b);
		b = elements.add("Java");
		System.out.println("new element? : "+ b);
		b = elements.add("PHP");
		System.out.println("new element? : "+ b);
	    
		System.out.println();
		
	    for(String s : elements) {
	    	System.out.println(s);
	    }
	}
}
