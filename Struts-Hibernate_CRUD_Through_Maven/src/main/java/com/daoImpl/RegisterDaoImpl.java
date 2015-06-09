package com.daoImpl;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.RegisterDao;
import com.model.Customer;
import com.utility.HibernatePlugin;

public class RegisterDaoImpl implements RegisterDao {

	public void registerUser(Customer customer) {
		// TODO Auto-generated method stub
		SessionFactory factory=HibernatePlugin.getFactory();
		Session session=factory.openSession();
		customer.setCustomerName(customer.getCustomerName());
		customer.setCustomerPass(customer.getCustomerPass());
		customer.setCustomerAddress(customer.getCustomerAddress());
		session.save(customer);
		org.hibernate.Transaction tx=session.beginTransaction();
		tx.commit();
		session.close();
		
	}

}
