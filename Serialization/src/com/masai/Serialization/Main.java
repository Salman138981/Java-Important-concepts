package com.masai.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
   
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis= new FileInputStream("file1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj = ois.readObject();
		
		A a1 = (A)obj;
	    a1.funA();
	    
	    String wel = (String)ois.readObject();
	    System.out.println(wel);
	    
	    Integer i = (Integer)ois.readObject();
	    System.out.println(i);
	    
	    ois.close();
		
	}
}
