package com.test.products;

public class Chocolate extends Product {
		
	/*public Chocolate(int type, String name,int price) {
		this.type = type;
		this.name=name;
		this.price = price;
	}*/
	
	public Chocolate(String type, String name) {
		this.type = type;
		this.name=name;
	}
	
	public Chocolate() {
		super();
	}
	
	public String toString() {
		return "CHOCOLATE";
	}
}
