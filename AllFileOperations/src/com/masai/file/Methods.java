package com.masai.file;

import java.io.File;

public class Methods {
   
	public static void main(String[] args) {
		  
		  //File f = new File("E://myfiles/abc.txt");
		  
		  //System.out.println(f.length());
		  
//		  File f  = new File("E://");
//		  
//		  String[] str = f.list();
//		  
//		  for(String name: str) {
//			  System.out.println(name);
//		  }
		  
//		File f = new File("E://");
//		
//		File[] files =f.listFiles();
//		
//		for(File file : files) {
//			System.out.println(file);
//		}
		
		File f = new File("E://abc.txt");
		System.out.println(f.getName());
		System.out.println(f.getParent());
		
	}
}
