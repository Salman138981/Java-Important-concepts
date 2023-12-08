package com.masai.aptitude;

import java.util.ArrayList;

public class Practice2 {
   
	public static void main(String[] args) {
		 
		String sb = "Land";
		
		sb =sb.concat("Mister").replace('d', 'n').toUpperCase().replace('M', 'N').toString();
		
		System.out.println(sb);
		
		
		String s1 = new String("Moon");
		String s2 = new String("Youtube");
		
		System.out.println(s1=s2);
		
		ArrayList<Character> obj1 = new ArrayList<>();
		ArrayList<Character> obj2 = new ArrayList<>();
		
		obj1.add('A');
		obj1.add('B');
		obj2.add('A');
		obj2.add(1,'B');
		
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1==obj2);
		
		
	}
}
