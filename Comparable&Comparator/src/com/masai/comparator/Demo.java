package com.masai.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    
	public static void main(String[] args) {
		
		Comparator<Integer> com = new Comparator<Integer>(){
			 
			public int compare(Integer i, Integer j) {
				
				if(i%10 > i%j) {
					return 1;
				}
				else {
					return -1;
				}
			}
		};
		  
		List<Integer> nums = new ArrayList<>();
		
		nums.add(22);
		nums.add(21);
		nums.add(10);
		nums.add(33);
		
		Collections.sort(nums,com);
		
		System.out.println(nums);
		
		
		
	}
}
