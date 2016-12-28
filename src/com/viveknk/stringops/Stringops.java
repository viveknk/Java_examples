package com.viveknk.stringops;

public class Stringops {
	
	public static void main(String[] args) {
		
		String s="Sachin";  
		System.out.println(s.toUpperCase());//SACHIN  
		System.out.println(s.toLowerCase());//sachin  
		System.out.println(s);//Sachin(no change in original)  
		
		String s2 ="  Sachin  ";  
		System.out.println(s2);//  Sachin    
		System.out.println(s2.trim());//Sachin
		
		s="Sachin";
		System.out.println(s.startsWith("Sa"));//true
		System.out.println(s.endsWith("n"));//true
		
		System.out.println(s.charAt(0));//S
		System.out.println(s.charAt(3));//h  
		
		System.out.println(s.length());//6  
		
		int a=10;  
		
		String num=String.valueOf(a);
		System.out.println(num+10);
		
		s = "Java is a programming language. Java is a platform. Java is an Island.";
		String replaceString=s.replace("Java","C++");//replaces all occurrences of "Java" to "C++"    
		System.out.println("replced : "+replaceString);
		
		String replaceString2 =s.replaceAll("p[a-z]*","*replaced*");//replaces all occurrences of "Java" to "C++"    
		System.out.println("replced : "+replaceString2);
		
		System.out.println("substring of s = "+ s.substring(5));
		
		System.out.println("substring of s = "+ s.substring(5,10));
		
		s = "India , Pakistan";
		String[ ] ss = s.split(",");
		System.out.println("spliiting of s length = "+ ss.length);
		for(String splitStr : ss) {
			System.out.println(splitStr);
		}
		
		s = "India - China";
		ss = s.split("\\-");
		System.out.println("spliiting of s length = "+ ss.length);
		for(String splitStr : ss) {
			System.out.println(splitStr);
		}
		
		System.out.println("first index of i = "+s.indexOf('i'));
		System.out.println("last index of i = "+s.lastIndexOf('i'));
		
		String one = "hello";
		String two = "hello";
		String three = "Hello";
		
		if(one.equals(two)) {
			System.out.println("one and two are exactly equal");
		}
		
		if(one.equals(three)) {
			System.out.println("one and three are exactly equal");
		} else if(one.equalsIgnoreCase(three)) {
			System.out.println("one and three are equal but different case");
		}
	}
}
