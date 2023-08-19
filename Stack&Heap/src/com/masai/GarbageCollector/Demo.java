package com.masai.GarbageCollector;

public class Demo {
    
	public void finalize() {
		System.out.println("Garbage Collection");
	}
	
	public static void main(String[] args) {
		 Demo d1 = new Demo();
		 Demo d2 = new Demo();
		 
		 d1 =null;
		 
		 System.gc();
		 
		 
		 
		 // Wrapper Classes
		 int n = 10;
		 
		 //Integer num = new Integer(n); // boxing;
		 
		 Integer num = n;  //autoboxing;
		 
		 //int x = num.intValue();  // unboxing
		 int x = num;  //autounboxing
	}
}
