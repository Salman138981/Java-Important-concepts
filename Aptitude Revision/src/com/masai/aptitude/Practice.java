package com.masai.aptitude;

public class Practice {
   
  public static void main(String[] args) {
	 String str1 = "Salman";
	 String str2 = "Salman";
	 
	 if(str1.equals(str2)) {
		 System.out.println(true);
	 }else {
		 System.out.println(false);
	 }
	 
	 int sum=0;
	 
	 for(int i=0, j=0; i<5 && j<5; ++i, j=i+1) 
		 	 sum= sum+i;
	 
   System.out.print(sum);
	 
}
}