package com.masai.thread;

class A extends Thread{
	@Override
	public void run() {
		
		for(int i=1; i<=100; i++)
		System.out.println("Hi");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class B extends Thread{
	
	public void run() {
		
		for(int i=1; i<=100;i++)
		System.out.println("hello");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Demo {
    
	public static void main(String[] args) throws InterruptedException {
		A a = new A();
		B b = new B();
		
		
		System.out.println(a.getPriority());
		System.out.println(b.getPriority());
		
		a.start();
		
		Thread.sleep(1);
		b.start();
	}
	
}
