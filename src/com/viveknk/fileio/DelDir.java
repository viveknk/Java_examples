package com.viveknk.fileio;

import java.io.File;

public class DelDir {

	public static void main(String[] args) {
		
		String dirname = "C://mynewdir";
	    File d = new File(dirname);
	    
	    //check if this already exists
	    System.out.println("already exists : "+d.exists());
	    
	    if(d.exists()) {
	    	//Create directory now.
	    	d.delete();
	    	System.out.println("deleted successfully!");
	    }
	    
	    System.out.println("still exists : "+d.exists());
	    
	}
}
