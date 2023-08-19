package com.masai.InnerClass;

public class A {
     
	int i=10;
	
	public void print() {
		System.out.println("Inside A");
	}
	
   static class B{
		
		public void fun() {
			System.out.println("Inside B");
		}
		
	}
	
	public static void main(String[] args) {
	  
		A a = new A();
		
		A.B b = new A.B();
		
		b.fun();
		
		
	}
}
