package Product.test;
import java.util.ArrayList;
import java.util.Iterator;

import Product.declaration.Product;
import Product.service.ProductImpl;

public class Producttest {

	public static void main(String[] args) {
		ArrayList plist=new ArrayList<Product>();
		plist.add(new Product(20,897,"book"));
		plist.add(new Product(21,87,"pen"));
		plist.add(new Product(22,89,"Table"));
		plist.add(new Product(23,597,"box"));
		System.out.println("The details of the product are given below");
		/*Iterator i=plist.iterator();
		while(i.hasNext())
			System.out.println(i);*/
		
		
		ProductImpl pi=new ProductImpl();
		
		System.out.println("Name List of the products: "+pi.getProductNameList(plist));
		System.out.println("The sum of the products: "+pi.sumofprice(plist));
		System.out.println("The Maximum price of the product: "+pi.maxprice(plist));

	}

}
