package com.masai.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializedStudent {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		FileInputStream fis = new FileInputStream("f1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student stud = (Student)ois.readObject();
		
		System.out.println(stud.id);
		System.out.println(stud.name);
		System.out.println(stud.age);
	}

}
