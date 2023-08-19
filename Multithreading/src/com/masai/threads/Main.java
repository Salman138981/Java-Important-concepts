package com.masai.threads;

public class Main {
   
	public static void main(String[] args) {
		 
		 Runnable a = new A();
		 
		 Runnable b  = new B();
		 
		 Thread t1 = new Thread(a);
		 Thread t2 = new Thread(b);
		 
		 t1.setName("Salman");
		 t2.setName("Tejashree");
		 
		 t1.start();
		 t2.start();
		 
		 Thread.currentThread().setName("Master");
		 
		 System.out.println(Thread.currentThread().getName());
	}
}
