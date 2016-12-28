package com.viveknk.fileio;

import java.io.File;

public class CreateDir {

	public static void main(String[] args) {
		
		String dirname = "C://mynewdir";
	    File d = new File(dirname);
	    
	    //check if this already exists
	    System.out.println("already exists : "+d.exists());
	    
	    // Create directory now.
	    d.mkdirs();
	    
	    System.out.println("Absolute path : "+d.getAbsolutePath());
	}
}
