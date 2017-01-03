package com.niit.shoppingcart.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.model.User;

@Repository("userDao")
@EnableTransactionManagement
public class UserDaoImpl implements UserDao
{
	
	@Autowired
	private SessionFactory sessionFactory ;
	
	public UserDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
			
	}
	@Transactional
	public void addUser(User user)
	{
	sessionFactory.getCurrentSession().saveOrUpdate(user);
	}
}
