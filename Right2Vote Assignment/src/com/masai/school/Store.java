package com.masai.school;

public class Store {
    
	public static void main(String[] args) {
		 
		 final double budget = 600.00;
		 final double tShirt_Price = 50.00;
		 final double jeans_Price = 80.00;
		 final double jacket_Price = 100.00;
		 
		 int maxTshirt = (int)(budget/tShirt_Price);
		 int maxJeans = (int)(budget/jeans_Price);
		 int maxJacket = (int)(budget/jacket_Price);
		 
		 //total tshirt  can by in 600 is 12;
		 // total jeans  can by in 600 is 7;
		 // total jacket can be by in 600 is 6;
		 
		 // we will iterate through all possible combinations;
		 int totalPossibleCombinations =0;
		 for(int tshirt = 1; tshirt<=maxTshirt; tshirt++) {
			 
			 for(int jean = 1; jean<=maxJeans; jean++) {
				 
				 for(int jack=1; jack<=maxJacket; jack++) {
					 
					 double totalCost = tshirt * tShirt_Price+ jean* jeans_Price + jack * jacket_Price;
					 double balance = budget- totalCost;
					 
					 if(totalCost<= budget && tshirt>=1 && jean>=1 && jack>=1 && balance < tShirt_Price) {
						  System.out.println("T-Shirts: " + tshirt + ", Jeans: "+ jean + ", Jacket: "+ jack);
						  
						  System.out.println("Remaining balance After buying is: " + balance);
						  totalPossibleCombinations++;
					 }
				 }
			 }
		 }
		 System.out.println();
		 System.out.println("Total Possible Combinations are: "+ totalPossibleCombinations);
	}
}
