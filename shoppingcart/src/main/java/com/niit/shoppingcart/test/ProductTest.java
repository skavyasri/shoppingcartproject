package com.niit.shoppingcart.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.ProductDao;
import com.niit.shoppingcart.model.Product;



public class ProductTest 
{

public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();
		
		ProductDao productDao=(ProductDao)context.getBean("productDao");
		Product product =(Product) context.getBean("product");
		
		product.setId(202);
		product.setName("stap");
		product.setDescription("abcd");
		product.setPrice(5000);
		
		productDao.addProduct(product);
	}
}
