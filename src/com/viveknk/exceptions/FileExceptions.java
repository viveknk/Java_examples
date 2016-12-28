package com.viveknk.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExceptions {

	public static void main(String args[]){		
	      
		File file=new File("C://file.txt");
		
		try {
			
			FileReader fr = new FileReader(file);
			
		} catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		
		try {
			
			char[] line = new char[200];
			FileReader fr = new FileReader(file);
			fr.read(line);
			fr.close();
			
		} catch(FileNotFoundException ex) {
			ex.printStackTrace();
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}