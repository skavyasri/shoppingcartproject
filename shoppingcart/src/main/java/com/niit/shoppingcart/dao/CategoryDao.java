package com.niit.shoppingcart.dao;

import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.User;

import antlr.collections.List;

public interface CategoryDao 
{
	public void addCategory(Category category);
	public Category getCategory(String id);
	public void delete(String id);
	//public List<Category> list();
	public Category getByName(String name);

}
