package com.viveknk.fileio;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadByteStream {
	
	public static void main(String[] args) {
		
		//byte stream
		FileInputStream in = null;
		try {
	        in = new FileInputStream("input.txt");
	        int c;
	        while ((c = in.read()) != -1) {
	           System.out.print((char)c);
	        }
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
	        if (in != null) {
	           try {
				in.close();
			   } catch (IOException e) {
				e.printStackTrace();
			   }
	        }
		}
	}

}
