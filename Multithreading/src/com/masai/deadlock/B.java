package com.masai.deadlock;

public class B {
public synchronized void funB(A a1){
		//1 hour
		System.out.println("funB of B starts");
		
		a1.fun1(); //t2 -->b1 a1
		
		System.out.println("funB of B ends");
	}
	
	public synchronized void fun2(){
		System.out.println("inside fun2 of B");
	}
}