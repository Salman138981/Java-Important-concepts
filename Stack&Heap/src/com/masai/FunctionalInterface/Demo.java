package com.masai.FunctionalInterface;


@FunctionalInterface
interface Addition{
	
	public int add(int i, int j);
}

public class Demo {
    
	public static void main(String[] args) {
		
		Addition  a = (i,j) ->  i+j;
		
		
		
		int add = a.add(4, 5);
		System.out.println(add);
		  
	}
}
