package Product.service;

import java.util.ArrayList;
import java.util.List;

import Product.declaration.Product;

interface ProductInter {
	double sumofprice(ArrayList<Product> pl);
	float maxprice(ArrayList<Product> pl);
	float minprice(ArrayList<Product> pl);
	List<String> getProductNameList(ArrayList<Product> pl);
}
