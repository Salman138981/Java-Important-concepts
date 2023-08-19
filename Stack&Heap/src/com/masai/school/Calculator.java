package com.masai.school;

public class Calculator {
	
	int num;
	
	public int add(int i, int j) {
		return i+j;
	}
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		int val = cal.add(5, 4);
		
		System.out.println(val);
	}

}
