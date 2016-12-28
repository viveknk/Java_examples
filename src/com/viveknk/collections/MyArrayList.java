package com.viveknk.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyArrayList {

    public static void main(String[] args) {

      // create a list, use is ArrayList as concrete type
      // ArrayList<> infers the String type from the left side
        List<String> var = new ArrayList<>();

        // add a few Strings to it
        var.add("India");
        var.add("USA");
        var.add("Russia");
        var.add("England");
        var.add("France");

        for(String s : var) {
        	System.out.println(s);
        }
        
        // print each element to the console using Java 8 syntax
        //var.forEach(System.out::println);
        
        System.out.println("\nPrinting with iterator..");
        Iterator<String> it = var.iterator(); 
        while(it.hasNext()) {
        	String val = it.next();
        	System.out.println(val);
        }
    }
}