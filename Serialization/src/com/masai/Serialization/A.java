package com.masai.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class A implements Serializable{
     
	int x = 10;
	
	public void funA() {
		System.out.println("inside funA() of A");
		System.out.println(x);
	}
	
	public static void main(String[] args) throws IOException {
		 
		A a = new A();
		a.x=12;  // change the state of an object
		FileOutputStream fos = new FileOutputStream("file1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(a);
	
		oos.writeObject("Welcome"); // String Class object
		oos.writeObject(10);
		
		oos.close();
		
		System.out.println("a object is serialized");
	}
}
