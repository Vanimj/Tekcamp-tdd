package com.test.products;

public abstract class Product {
	protected String type;
	protected String name;
	protected double price;
	protected double salesTax;
	protected boolean isImported;
	
	public boolean isImported() {
		return isImported;
	}

	public void setImported(boolean isImported) {
		this.isImported = isImported;
	}

	public double getSalesTax() {
		return salesTax;
	}

	public void setSalesTax(double salesTax) {
		this.salesTax = salesTax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product() {
		super();
	}
}