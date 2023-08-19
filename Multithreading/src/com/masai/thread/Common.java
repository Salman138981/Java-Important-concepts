package com.masai.thread;

public class Common {
    
	public void fun1(String name) {
		//10000
		synchronized(Common.class){
			System.out.println("Welcome...");
			 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//1000
			System.out.println(name);  
		}
	                                                                                                                                                                                                                                                                                                                                                                                                                                         
	}
}
