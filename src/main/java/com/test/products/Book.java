package com.test.products;

public class Book extends Product {
		
	public Book(String type, String name) {
		this.type=type;
		this.name=name;
	}
	
	public Book() {
		super();
	}
	
	public String toString() {
		return "BOOK";
	}
}
