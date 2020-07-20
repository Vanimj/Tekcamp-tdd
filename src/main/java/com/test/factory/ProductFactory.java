package com.test.factory;

import com.test.constants.ApplicationConstants;
import com.test.products.Book;
import com.test.products.CD;
import com.test.products.Chocolate;
import com.test.products.Perfume;
import com.test.products.Pill;
import com.test.products.Product;

public class ProductFactory {

	public static Product getProductType(int productType) {
		System.out.println("Product Factory :: "+productType);
		
		Product product = null;
		switch(productType) {
		
		case ApplicationConstants.BOOK:
			product = new Book("BOOKS","BOOK");
			break;
		case ApplicationConstants.CD:
			product = new CD("OTHERS","CD");
			break;
		case ApplicationConstants.CHOCOLATE :
			product = new Chocolate("FOOD","CHOCOLATE");
			break;
		case ApplicationConstants.PERFUME :
			product = new Perfume("OTHERS","PERFUME");
			break;
		case ApplicationConstants.PILL :
			product = new Pill("MEDICALS","HEADACHE");
			break;
		default :
			product = null;
			break;
		}
		if(product!=null)
		System.out.println("Product Type :"+ product.toString());
		
		return product;
	}
	
}
