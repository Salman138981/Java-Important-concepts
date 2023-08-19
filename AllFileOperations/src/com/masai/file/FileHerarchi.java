package com.masai.file;

import java.io.File;

public class FileHerarchi {
   
	public static void readFile(File file) {
		
		File[] f =file.listFiles(); 
		
		for(File fi: f) {
			if(fi.isDirectory()) {
				readFile(fi);
			}else {
				System.out.println(fi.getName());
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		File f = new File("E://x1");
		readFile(f);
	}
}
