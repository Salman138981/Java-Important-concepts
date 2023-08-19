package com.masai.thread;

// thread-Safe --> preventing data inconsistency
class Count{
	
	int count;
	
	public synchronized void increament() {
		 count++;
	}
}


public class RaceCondition {
  
	public static void main(String[] args) throws InterruptedException {
		
		Count i1 = new Count();
		
		Runnable r1 = () -> {
		   	for(int i=1; i<=1000; i++) {
		   		i1.increament();
		   	}
		      
		};
		
		Runnable r2 = () -> {
			
			for(int i=1; i<=1000; i++) {
				i1.increament();
			}
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(i1.count);
		
	}
}
