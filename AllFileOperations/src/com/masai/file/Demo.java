package com.masai.file;

import java.io.File;
import java.io.IOException;

public class Demo {
    
	public static void main(String[] args) throws IOException{
		 
		
//		File f = new File("E://myfiles");
//		
//		System.out.println(f.exists());
//		
//		f.mkdir();
//		
//		System.out.println(f.exists());
		
//		File f = new File("E://myfiles/abc.txt");
//		boolean f1 =f.createNewFile();
//		System.out.println(f.exists());
		
		//File f = new File("E://myfiles","b.txt");
		
		File f = new File("E://myfiles");
		File f1 = new File(f,"b.txt");
		System.out.println(f1.createNewFile());
		
	}
}
