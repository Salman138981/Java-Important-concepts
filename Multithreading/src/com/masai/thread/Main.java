package com.masai.thread;

public class Main {
     
	public static void main(String[] args) throws InterruptedException {
		  
		   Common c1 = new Common();
		   Common c2 = new Common();
		
		  ThreadA a = new ThreadA(c1,"Salman");
		  ThreadB b = new ThreadB(c2,"Saru");
		  
		  a.start();
		  b.start();
		  
		
		  
		  
	}
}
