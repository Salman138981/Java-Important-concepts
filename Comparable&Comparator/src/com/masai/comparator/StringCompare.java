package com.masai.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringCompare {
   
	public static void main(String[] args) {
		
		List<String> string = new ArrayList<>();
		
		string.add("Salman");
		string.add("Saru");
		string.add("Tejashree");
		string.add("Amina");
		
		Collections.sort(string, new Stringlenth());
		
		System.out.println(string);
	}
}
