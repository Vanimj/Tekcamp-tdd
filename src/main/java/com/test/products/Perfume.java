package com.test.products;

public class Perfume extends Product {
		
	public Perfume(String type, String name) {
		this.type=type;
		this.name=name;
	}
	
	public Perfume() {
		super();
	}
	
	public String toString() {
		return "PERFUME";
	}
}
