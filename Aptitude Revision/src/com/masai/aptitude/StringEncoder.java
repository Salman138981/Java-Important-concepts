package com.masai.aptitude;

import java.util.Scanner;

public class StringEncoder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		String result = encod(str);
		System.out.println(result);
	}
	
	public static String encod(String str) {
		 
		if(str.length()!=9 || !str.equals(str.toLowerCase())) {
			return "Invalid";
		}
		
		String first = str.substring(0,3);
		String second = str.substring(3,6);
		String third = str.substring(6);
		
	    int first_char =Character.getNumericValue(first.charAt(0));
	    char second_char = first.charAt(1);
	    int third_char = Character.getNumericValue(first.charAt(2));
	    
	    StringBuilder reverString = new StringBuilder(third).reverse();
	    
	    String encodeString = first_char+"" +second_char+""+ third_char + second+ reverString;
	    return encodeString;
	}
}
