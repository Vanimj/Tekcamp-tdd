package com.test.products;

public class CD extends Product {
		
	
	
	public CD(String type, String name) {
		this.type = type;
		this.name=name;
	}
	
	public CD() {
		super();
	}
	
	public String toString() {
		return "CD";
	}
}
