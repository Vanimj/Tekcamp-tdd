package com.test.main;

import java.text.DecimalFormat;

import com.test.constants.ApplicationConstants;
import com.test.factory.ProductFactory;
import com.test.products.Product;

public class MainApplication {

	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		
		// Input-1
		Product prodObj1 = ProductFactory.getProductType(ApplicationConstants.BOOK);
		prodObj1.setPrice(12.49);
		// ApplicationConstants.products.contains(prodObj1.getType()) ? 0 : prodObj1.setSalesTax(prodObj1.getPrice()*(10/100));
		
		if(!ApplicationConstants.products.contains(prodObj1.getType())) {
			prodObj1.setSalesTax(prodObj1.getPrice()*(10/100));
			System.out.println("Inside Book Sales Tax :: "+prodObj1.getSalesTax());
			if(prodObj1.isImported()) {
				prodObj1.setSalesTax((prodObj1.getPrice()*(5/100))+prodObj1.getSalesTax());
			}
				
			prodObj1.setPrice(prodObj1.getPrice()+prodObj1.getSalesTax());
		}
		
		Product prodObj2 = ProductFactory.getProductType(ApplicationConstants.CD);
		prodObj2.setPrice(14.99);
		
		if(!ApplicationConstants.products.contains(prodObj2.getType())) {
			System.out.println("CD PRice :: "+prodObj2.getPrice());
			prodObj2.setSalesTax((prodObj2.getPrice()*10)/100);
			System.out.println("Inside CD Sales Tax :: "+prodObj2.getSalesTax());
			prodObj2.setPrice(prodObj2.getPrice()+prodObj2.getSalesTax());
		}
		
		Product prodObj3 = ProductFactory.getProductType(ApplicationConstants.CHOCOLATE);
		prodObj3.setPrice(0.85);
		
		if(!ApplicationConstants.products.contains(prodObj3.getType())) {
			prodObj3.setSalesTax(prodObj3.getPrice()*(10/100));
			System.out.println("Inside Chocolate Sales Tax :: "+prodObj3.getSalesTax());
			prodObj3.setPrice(prodObj3.getPrice()+prodObj3.getSalesTax());
		}
		
		System.out.println("Prod1 :: "+prodObj1.getName()+"\t Prod2 :: "+prodObj2.getName()+" Prod3 :: "+prodObj3.getName());
		System.out.println("1 Book           :: "+prodObj1.getPrice());
		System.out.println("1 music CD       :: "+prodObj2.getPrice());
		System.out.println("1 Chocolate bar  :: "+prodObj3.getPrice());
		System.out.println("Sales Taxes :: "+df.format((prodObj1.getSalesTax()+prodObj2.getSalesTax()+prodObj3.getSalesTax())));
		System.out.println("Total Taxes :: "+df.format((prodObj1.getPrice()+prodObj2.getPrice()+prodObj3.getPrice())));
		System.out.println("=====================================================================");
		
		// Input-2
		// Chocoloate
		Product prodObj4 = ProductFactory.getProductType(ApplicationConstants.CHOCOLATE);
		prodObj4.setPrice(10.00);
		prodObj4.setImported(true);
		if(!ApplicationConstants.products.contains(prodObj4.getType())) {
			prodObj4.setSalesTax((prodObj4.getPrice()*10)/100);
				System.out.println("Before Import Chocolate Sales Tax :: "+prodObj4.getSalesTax());
				if(prodObj4.isImported()) {
					prodObj4.setSalesTax(((prodObj4.getPrice()*5)/100)+prodObj4.getSalesTax());
				}
				System.out.println("After Import Chocolate Sales Tax :: "+prodObj4.getSalesTax());
					prodObj4.setPrice(prodObj4.getPrice()+prodObj4.getSalesTax());
					prodObj4.setPrice(Double.parseDouble(df.format(prodObj4.getPrice())));
				
		}else if(prodObj4.isImported()) {
			prodObj4.setSalesTax(((prodObj4.getPrice()*5)/100)+prodObj4.getSalesTax());
			prodObj4.setSalesTax(Double.parseDouble(df.format(prodObj4.getSalesTax())));
			prodObj4.setPrice(prodObj4.getPrice()+prodObj4.getSalesTax());
			prodObj4.setPrice(Double.parseDouble(df.format(prodObj4.getPrice())));
		}
		
		
		Product prodObj5 = ProductFactory.getProductType(ApplicationConstants.PERFUME);
		prodObj5.setPrice(47.50);
		prodObj5.setImported(true);
		if(!ApplicationConstants.products.contains(prodObj5.getType())) {
			prodObj5.setSalesTax((prodObj5.getPrice()*10)/100);
				System.out.println("Before Import Perfume Sales Tax :: "+prodObj5.getSalesTax());
				if(prodObj5.isImported()) {
					prodObj5.setSalesTax(((prodObj5.getPrice()*5)/100)+prodObj5.getSalesTax());
				}
				System.out.println("After Import Perfume Sales Tax :: "+prodObj5.getSalesTax());
				prodObj5.setSalesTax(Double.parseDouble(df.format(prodObj5.getSalesTax())));
				System.out.println("Rounding Import Perfume Sales Tax :: "+prodObj5.getSalesTax());
				prodObj5.setPrice(prodObj5.getPrice()+prodObj5.getSalesTax());
				prodObj5.setPrice(Double.parseDouble(df.format(prodObj5.getPrice())));
				
		}else if(prodObj5.isImported()) {
			prodObj5.setSalesTax(((prodObj5.getPrice()*5)/100)+prodObj5.getSalesTax());
			prodObj5.setSalesTax(Double.parseDouble(df.format(prodObj5.getSalesTax())));
			prodObj5.setPrice(prodObj5.getPrice()+prodObj5.getSalesTax());
			prodObj5.setPrice(Double.parseDouble(df.format(prodObj5.getPrice())));
		}
		
		System.out.println("1 imported box of chocolates at :: "+prodObj4.getPrice());
		System.out.println("1 imported bottle of perfume    :: "+prodObj5.getPrice());
		System.out.println("2Sales Taxes :: "+df.format(prodObj4.getSalesTax()+prodObj5.getSalesTax()));
		System.out.println("2Total Taxes :: "+df.format(prodObj4.getPrice()+prodObj5.getPrice()));
		
		System.out.println("=================================================================================");
		
				// Input-3
				// Imported Perfume
				Product prodObj6 = ProductFactory.getProductType(ApplicationConstants.PERFUME);
				prodObj6.setPrice(27.99);
				prodObj6.setImported(true);
				if(!ApplicationConstants.products.contains(prodObj6.getType())) {
					prodObj6.setSalesTax((prodObj6.getPrice()*10)/100);
						System.out.println("Before Import Chocolate Sales Tax :: "+prodObj6.getSalesTax());
						if(prodObj6.isImported()) {
							prodObj6.setSalesTax(((prodObj6.getPrice()*5)/100)+prodObj6.getSalesTax());
						}
						System.out.println("After Import Chocolate Sales Tax :: "+prodObj6.getSalesTax());
						
						System.out.println("After  Perfume Sales Tax :: "+prodObj6.getSalesTax());
						prodObj6.setSalesTax(Double.parseDouble(df.format(prodObj6.getSalesTax())));
						System.out.println("Rounding Perfume Sales Tax :: "+prodObj6.getSalesTax());
						
							prodObj6.setPrice(prodObj6.getPrice()+prodObj6.getSalesTax());
							
							prodObj6.setPrice(Double.parseDouble(df.format(prodObj6.getPrice())));
						
				}else if(prodObj6.isImported()) {
					prodObj6.setSalesTax(((prodObj6.getPrice()*5)/100)+prodObj6.getSalesTax());
					prodObj6.setSalesTax(Double.parseDouble(df.format(prodObj6.getSalesTax())));
					prodObj6.setPrice(prodObj6.getPrice()+prodObj6.getSalesTax());
					prodObj6.setPrice(Double.parseDouble(df.format(prodObj6.getPrice())));
				}
				
				// Perfume
				Product prodObj7 = ProductFactory.getProductType(ApplicationConstants.PERFUME);
				prodObj7.setPrice(18.99);
				prodObj7.setImported(false);
				if(!ApplicationConstants.products.contains(prodObj7.getType())) {
					System.out.println("Product 7 ----------- ");
					prodObj7.setSalesTax((prodObj7.getPrice()*10)/100);
						System.out.println("Before  Perfume Sales Tax :: "+prodObj7.getSalesTax());
						if(prodObj7.isImported()) {
							prodObj7.setSalesTax(((prodObj7.getPrice()*5)/100)+prodObj7.getSalesTax());
						}
						System.out.println("After  Perfume Sales Tax :: "+prodObj7.getSalesTax());
						prodObj7.setSalesTax(Double.parseDouble(df.format(prodObj7.getSalesTax())));
						System.out.println("Rounding Perfume Sales Tax :: "+prodObj7.getSalesTax());
						
							prodObj7.setPrice(prodObj7.getPrice()+prodObj7.getSalesTax());
							prodObj7.setPrice(Double.parseDouble(df.format(prodObj7.getPrice())));
						
				}else if(prodObj7.isImported()) {
					prodObj7.setSalesTax(((prodObj7.getPrice()*5)/100)+prodObj7.getSalesTax());
					prodObj7.setSalesTax(Double.parseDouble(df.format(prodObj7.getSalesTax())));
					prodObj7.setPrice(prodObj6.getPrice()+prodObj7.getSalesTax());
					prodObj7.setPrice(Double.parseDouble(df.format(prodObj7.getPrice())));
				}
				
				// headache pills
				Product prodObj8 = ProductFactory.getProductType(ApplicationConstants.PILL);
				prodObj8.setPrice(9.75);
				prodObj8.setImported(false);
				if(!ApplicationConstants.products.contains(prodObj8.getType())) {
					prodObj8.setSalesTax((prodObj8.getPrice()*10)/100);
						System.out.println("Before Import Pill Sales Tax :: "+prodObj8.getSalesTax());
						if(prodObj8.isImported()) {
							prodObj8.setSalesTax(((prodObj8.getPrice()*5)/100)+prodObj8.getSalesTax());
						}
						System.out.println("After Import Pill Sales Tax :: "+prodObj8.getSalesTax());
						
							prodObj8.setPrice(prodObj8.getPrice()+prodObj8.getSalesTax());
							prodObj8.setPrice(Double.parseDouble(df.format(prodObj8.getPrice())));
						
				}else if(prodObj8.isImported()) {
					prodObj8.setSalesTax(((prodObj8.getPrice()*5)/100)+prodObj8.getSalesTax());
					prodObj8.setSalesTax(Double.parseDouble(df.format(prodObj8.getSalesTax())));
					prodObj8.setPrice(prodObj8.getPrice()+prodObj8.getSalesTax());
					prodObj8.setPrice(Double.parseDouble(df.format(prodObj8.getPrice())));
				}
				
				// imported box of chocolates
				Product prodObj9 = ProductFactory.getProductType(ApplicationConstants.CHOCOLATE);
				prodObj9.setPrice(11.25);
				prodObj9.setImported(true);
				if(!ApplicationConstants.products.contains(prodObj9.getType())) {
					prodObj9.setSalesTax((prodObj9.getPrice()*10)/100);
						System.out.println("Before Import Chocolate Sales Tax :: "+prodObj9.getSalesTax());
						if(prodObj9.isImported()) {
							prodObj9.setSalesTax(((prodObj9.getPrice()*5)/100)+prodObj9.getSalesTax());
						}
						System.out.println("After Import Chocolate Sales Tax :: "+prodObj9.getSalesTax());
						prodObj9.setSalesTax(Double.parseDouble(df.format(prodObj9.getSalesTax())));
						System.out.println("Rounding Import Chocolate Sales Tax :: "+prodObj9.getSalesTax());
						
							prodObj9.setPrice(prodObj9.getPrice()+prodObj9.getSalesTax());
							prodObj9.setPrice(Double.parseDouble(df.format(prodObj9.getPrice())));
						
				} else if(prodObj9.isImported()) {
					prodObj9.setSalesTax(((prodObj9.getPrice()*5)/100)+prodObj9.getSalesTax());
					prodObj9.setSalesTax(Double.parseDouble(df.format(prodObj9.getSalesTax())));
					prodObj9.setPrice(prodObj9.getPrice()+prodObj9.getSalesTax());
					prodObj9.setPrice(Double.parseDouble(df.format(prodObj9.getPrice())));
				}
				
				System.out.println("1 imported bottle of perfume: "+prodObj6.getPrice());
				System.out.println("1 bottle of perfume         : "+prodObj7.getPrice());
				System.out.println("1 packet of headache pills  : "+prodObj8.getPrice());
				System.out.println("1 imported box of chocolates: "+prodObj9.getPrice());
				System.out.println("3Sales Taxes :: "+df.format(prodObj6.getSalesTax()+prodObj7.getSalesTax()+prodObj8.getSalesTax()+prodObj9.getSalesTax()));
				System.out.println("3Total Taxes :: "+df.format(prodObj6.getPrice()+prodObj7.getPrice()+prodObj8.getPrice()+prodObj9.getPrice()));
	}
}
