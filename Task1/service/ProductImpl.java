package Product.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import Product.declaration.Product;
public class ProductImpl  
{
	 public double sumofprice(ArrayList<Product> pl)
	 { 
		double sum=0;
		Iterator<Product> i=pl.iterator();
		while(i.hasNext())
		{
			Product p=(Product)i.next();
			sum=sum+p.getPrice();	
		}
		return sum;
	 }
	
	 public float maxprice(ArrayList<Product> pl)
	 {
		return (float)Collections.max(pl).getPrice();
	 }
	 
	 public float minprice(ArrayList<Product> pl)
	 {
		return (float)Collections.min(pl).getPrice();
	 }
	 
	 public List<String> getProductNameList(ArrayList<Product> pl)
	 {
		List<String> l=new ArrayList<String>();
		Iterator i=pl.iterator();
			while(i.hasNext())
				l.add(((Product)i.next()).getName());
			return l;
		  
				 }
	
}