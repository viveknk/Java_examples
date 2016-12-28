package com.viveknk.fileio;

import java.io.File;

public class CreateRenameFile {

	public static void main(String[] args) throws Exception {
		
		String path = "C://mynewdir//mynewfile.txt";
	    File f = new File(path);
	    
	    //create the file if not already present
	    if(!f.exists()) {
	    	f.createNewFile();
	    	System.out.println("Not existing.. so created a new file now..");
	    }
	    
	    System.out.println("absolute path : "+f.getAbsolutePath());
	    
	    System.out.println("Parent file name is : "+f.getParent());
	    
	    String newpath = "C://mynewdir//renamedfile.txt";
	    File renamedFile = new File(newpath);
	    f.renameTo(renamedFile);
	}
}
