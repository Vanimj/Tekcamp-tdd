package com.test.products;

public class Pill extends Product {
		
	public Pill(String type, String name) {
		this.type=type;
		this.name=name;
	}
	
	public Pill() {
		super();
	}
	
	public String toString() {
		return "PILL";
	}
}
