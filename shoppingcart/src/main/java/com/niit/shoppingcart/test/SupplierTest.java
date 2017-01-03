package com.niit.shoppingcart.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.SupplierDao;
import com.niit.shoppingcart.dao.SupplierDaoImpl;
import com.niit.shoppingcart.model.Supplier;

public class SupplierTest 
{
public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();
		
		SupplierDao supplierDao=(SupplierDao)context.getBean("supplierDao");
		Supplier supplier=(Supplier) context.getBean("supplier");
		
		supplier.setId("101");
		supplier.setName("sam");
		supplier.setAddr("abcdefgh");
		supplier.setPhn("990089");
		supplierDao.addSupplier(supplier);
	}
}


