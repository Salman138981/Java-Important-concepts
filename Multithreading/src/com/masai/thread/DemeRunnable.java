package com.masai.thread;




//Runnable Interface in a Functional Interface
//Tread Class is Implements runnable Interface Internally
//class D implements Runnable{
//	
//	public void run() {
//		
//		for(int i=1; i<=100;i++)
//		System.out.println("hello");
//		try {
//			Thread.sleep(10);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//}

public class DemeRunnable{
    
	public static void main(String[] args) throws InterruptedException {
		Runnable a = () ->{
				
				for(int i=1; i<=100; i++)
				System.out.println("Hi");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			};
		Runnable b =  () -> {
				
				for(int i=1; i<=100; i++)
				System.out.println("Hello");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			};
		
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		
		
		t1.start();
		t2.start();
	}
	
}
