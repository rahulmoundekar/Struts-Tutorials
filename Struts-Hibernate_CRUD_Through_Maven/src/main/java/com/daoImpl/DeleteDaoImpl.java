package com.daoImpl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dao.DeleteDao;
import com.utility.HibernatePlugin;

public class DeleteDaoImpl implements DeleteDao{

	public void deleteCustomer(int customer_id) {
		
		SessionFactory factory=HibernatePlugin.getFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		System.out.println(customer_id);
	
		Query query=session.createQuery("delete from Customer customer where customer.customerId="+customer_id);
		// TODO Auto-generated method stub
		query.executeUpdate();
		System.out.println("Records deleted successfully");
		tx.commit();
	}

}
