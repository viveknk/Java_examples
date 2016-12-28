package com.viveknk.accessmods;

public class Child extends Parents {

	private String mobilePassword = "czechoslovakia%729$$##$$56y";
	
	public void connectTo3G() {
		System.out.println("Hi.. welcome.. you are connected with the password " + mobilePassword + "successfully!!");
	}
	
	public void broadCastMessage() {
		System.out.println("Hi all.. this is broadcast message!!");
	}
	
	private void whatIsMyHomeWifi() {
		System.out.println("the home wifi password is "+ homewifipassword);
	}
}
