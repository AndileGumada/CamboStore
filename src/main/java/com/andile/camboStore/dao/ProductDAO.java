package com.andile.camboStore.dao;

import java.util.ArrayList;
import java.util.List;

import com.andile.camboStore.model.Product;

public class ProductDAO {

	private List<Product> productList;
	
	public List<Product> getProducttList(){
		
		Product product1 = new Product();
		product1.setProductName("Apple");
		product1.setProductCategory("iPhone");
		product1.setProductDescription("This is a new phone");
		product1.setProductPrice(1200);
		product1.setProductCondition("New Arrival");
		product1.setProductStatus("Active");
		product1.setUnitInStock(20);
		product1.setProductManufacturer("Apple");
		
		Product product2 = new Product();
		product2.setProductName("SamSung");
		product2.setProductCategory("Galaxy Edge");
		product2.setProductDescription("This is a new phone");
		product2.setProductPrice(1200);
		product2.setProductCondition("New Arrival");
		product2.setProductStatus("Active");
		product2.setUnitInStock(20);
		product2.setProductManufacturer("SamSung");
		
		Product product3 = new Product();
		product3.setProductName("Apple");
		product3.setProductCategory("iPhone");
		product3.setProductDescription("This is a new phone");
		product3.setProductPrice(1200);
		product3.setProductCondition("New Arrival");
		product3.setProductStatus("Active");
		product3.setUnitInStock(20);
		product3.setProductManufacturer("Apple");
		
		productList = new ArrayList<Product>();
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		return productList;
	}
	
}
