package com.viveknk.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReading {

	public static void main(String[] args) throws Exception {
		
		File f = new File("input.txt");
		
		FileReader fr = new FileReader(f);

		BufferedReader br = new BufferedReader(fr);
		
		String s = null;
		
		while((s=br.readLine())!=null) {
			System.out.println(s);
		}
		
		br.close();
		fr.close();
	}
}
