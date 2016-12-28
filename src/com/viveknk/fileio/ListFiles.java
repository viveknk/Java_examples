package com.viveknk.fileio;

import java.io.File;

public class ListFiles {
	
	public static void main(String[] args) {
		
		File file = null;
	    
		String[] paths;
	            
	    try {
	         // create new file object
	         file = new File("C:");
	         
	         // array of files and directory
	         paths = file.list();
	            
	         // for each name in the path array
	         for(String path:paths) {
	            // prints filename and directory name
	            System.out.println(path);
	         }
	         
	         File[] files = file.listFiles();
	         for(File currentFile : files) {
	        	 
	        	 String type = currentFile.isFile()?"File":"Dir";
	        	 String status = currentFile.isHidden()?"Hidden":"Normal";
	        	 
	        	 System.out.println(currentFile.getAbsolutePath()+"\t"+type+"\t"+status);
	         }
	         
	    }catch(Exception e){
	         // if any error occurs
	         e.printStackTrace();
	    }
	}

}
