package com.masai.StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Demo {
   public static void main(String[] args) {
	   List<Integer> nums = Arrays.asList(1,2,4,5,3,5,7,8,9,10);
		
//	    Stream<Integer> s1 = nums.stream();
//	     
//	    Stream<Integer> s2 = s1.distinct();
//	    
//	    //Stream<Integer> s3 = s2.filter(n -> n%2==0);
//	    
//	    Stream<Integer> s4 = s2.map(n -> n*2);
//	    Stream<Integer> s5 = s4.sorted();
//	    //boolean s6 =s5.allMatch(n -> n%2==0);
//	    boolean s7  = s5.anyMatch(n -> n%2==1);
////	    s6.forEach(System.out::println);
//	    System.out.println(s7);
	    
	   BinaryOperator<Integer> bi = (a,b) -> a+b;
	   
	   double value = nums.stream()
			   .filter(n -> n%2==0)
			   .sorted().collect(Collectors.averagingDouble(i->i*1));
			   
	   
	   System.out.println(value);
		
	
}   
 	
}
