package com.viveknk.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MyMap {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
	    
		String prevVal = null;
		prevVal = map.put("USA", "English");
		isNew("USA",prevVal);
		prevVal = map.put("France", "French");
		isNew("France",prevVal);
		prevVal = map.put("Germany", "Deutsch");
		isNew("Germany",prevVal);
		prevVal = map.put("Japan", "Japanese");
		isNew("Japan",prevVal);
		prevVal = map.put("India", "Hindi");
		isNew("India",prevVal);
		prevVal = map.put("India", "Tamil"); //this will replace the existing "India" key since in map keys are unique
		isNew("India",prevVal);
		
		System.out.println();
		
	    for(Map.Entry<String, String> s : map.entrySet()) {
	    	System.out.println(s.getKey()+" = "+s.getValue());
	    }
	    
	    System.out.println("\nPrinting with iterator..");
        Iterator<String> it = map.keySet().iterator(); 
        while(it.hasNext()) {
        	String key = it.next();
        	String val = map.get(key);
        	
        	System.out.println(key + " = " + val);
        }
	}
	
	private static void isNew(String key, String oldval) {
		
		if(oldval!=null) {
			System.out.println("Previous value for "+ key +" : "+oldval);
		} else {
			System.out.println("("+key+","+ oldval +") is a new key - value");
		}
	}
}