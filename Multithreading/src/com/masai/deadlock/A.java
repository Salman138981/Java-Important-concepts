package com.masai.deadlock;

public class A {
	public synchronized void funA(B b1){
		
		System.out.println("funA of A starts");
		 
		// t1 need b1 lock t1-->b1 a1
		b1.fun2();
		
		System.out.println("funA of A ends");
		
	}
	
	public synchronized void fun1(){
		System.out.println("inside fun1 of A");
	}
}
