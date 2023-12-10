package com.masai.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {
    
	int id;
	transient String name;
	transient int age; // now it will not be serialized;
	
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) throws IOException {
		 
		Student s1 = new Student(1,"Salman",25);
		
		FileOutputStream fos = new FileOutputStream("f1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(s1);
		
		oos.flush();
		oos.close();
		
		System.out.println("success");
	}
}
