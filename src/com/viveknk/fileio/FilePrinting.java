package com.viveknk.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class FilePrinting {

	public static void main(String[] args) throws Exception {
		
		File f = new File("input.txt");
		File out = new File("output.txt"); 
		
		FileReader fr = new FileReader(f);

		BufferedReader br = new BufferedReader(fr);
		
		PrintWriter pr = new PrintWriter(out);
		
		String s = null;
		
		while((s=br.readLine())!=null) {
			pr.println(s);
		}
		
		pr.flush();
		pr.close();
		
		br.close();
		fr.close();
	}
}
