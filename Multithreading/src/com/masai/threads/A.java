package com.masai.threads;

public class A implements Runnable{
	
	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
			
			System.out.println(Thread.currentThread().getName());
		}
	}

}
