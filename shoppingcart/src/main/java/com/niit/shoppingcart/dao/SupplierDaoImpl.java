package com.niit.shoppingcart.dao;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.model.Supplier;
import com.niit.shoppingcart.model.User;

@Repository("supplierDao")
@EnableTransactionManagement
public class SupplierDaoImpl implements SupplierDao
{
	
	@Autowired
	private SessionFactory sessionFactory ;
	
	public SupplierDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
			
	}
	@Transactional
	public void addSupplier(Supplier supplier)
	{
	sessionFactory.getCurrentSession().saveOrUpdate(supplier);
	}
}
