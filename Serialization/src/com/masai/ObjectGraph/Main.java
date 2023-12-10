package com.masai.ObjectGraph;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//whenever we are serializing an object, set of object which is reacheable from that object will be 
//serialize automatically, this group of object is nothing but Object Graph
//Note: in object graph every object should be serializabe, other wise it will throw and 
//runtime exception which is NotSerializableException.


public class Main{
    
	public static void main(String[] args) throws IOException{
		Dog dog = new Dog();
		
		FileOutputStream fos = new FileOutputStream("f2.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(dog);
		
		oos.flush();
		oos.close();
		
		System.out.println("success");
	}

}
