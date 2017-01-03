package com.niit.shoppingcart.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.UserDao;
import com.niit.shoppingcart.model.User;

public class UserTest
{
public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();
		
		UserDao userDao=(UserDao)context.getBean("userDao");
		User user =(User) context.getBean("user");
		
		user.setId(102);
		user.setName("prabhu");
		user.setPswd("prabhu123");
		user.setAddr("bglr");
		user.setPhnum("9900445689");
		user.setEmail("prabhu.l@gmail");
		
		userDao.addUser(user);
	}
}
	

