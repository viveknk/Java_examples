package com.viveknk.fileio;

import java.io.FileReader;
import java.io.IOException;

public class FileReadCharStream {
	
	public static void main(String args[]) throws IOException {
	      
		FileReader in = null;

	    try {
	         in = new FileReader("input.txt");
	         
	         int c;
	         while ((c = in.read()) != -1) {
	            System.out.print((char)c);
	         }
	    }finally {
	         if (in != null) {
	            in.close();
	         }
	    }
	}
}
