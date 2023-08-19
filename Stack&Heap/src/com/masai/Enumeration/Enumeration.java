package com.masai.Enumeration;

 public enum Enumeration {
    Infinix(20000), Asus(10000), Lenovo(25000), Apple, Microsoft(60000);
	 
	 private int price; 
	 
	 Enumeration(int price) {
		 this.price= price;
	 }

	Enumeration() {
		 this.price = 1000000;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
 }
 
