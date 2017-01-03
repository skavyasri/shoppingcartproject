package com.niit.shoppingcart.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CategoryDao;
import com.niit.shoppingcart.model.Category;

public class CategoryTest 
{
public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();
		
		CategoryDao categoryDao=(CategoryDao)context.getBean("categoryDao");
		Category category =(Category) context.getBean("category");
		
		category.setId("101");
		category.setName("sri");
		category.setDescription("xyz");
		
		categoryDao.addCategory(category);
	}
}
	

