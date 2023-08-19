package com.masai.thread;

public class ThreadA extends Thread{
	
	private Common c;
	private String name;
	
	public ThreadA(Common c, String name) {
		this.c = c;
		this.name = name;
	}
	
	
	
	@Override
	public void run() {
		
		c.fun1(name);
	}

}
