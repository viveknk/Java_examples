package com.viveknk.encap;

public class TestClass {

	public static void main(String[] args) {
		
		MyPojo mp = new MyPojo();
		//mp.location = "mumbai"; // this is not possible since it is a private member - we are gonna use the public setter method
		
		mp.setLocation("Mumbai"); //this is a public method
		
		System.out.println(mp.getName() +" is from "+ mp.getLocation());

	}

}
