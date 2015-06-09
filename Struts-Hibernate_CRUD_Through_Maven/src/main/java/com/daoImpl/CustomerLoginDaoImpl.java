package com.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.dao.CustomerLoginDao;
import com.model.Customer;
import com.opensymphony.xwork2.ModelDriven;
import com.utility.HibernatePlugin;

public class CustomerLoginDaoImpl implements CustomerLoginDao {

	public boolean customerLoginCheck(Customer customer) {
		// TODO Auto-generated method stub
		try {
			SessionFactory factory = HibernatePlugin.getFactory();
			Session session = factory.openSession();
			System.out.println("checking condition");
			Criteria criteria = session
					.createCriteria(Customer.class)
					.add(Restrictions.eq("customerName",
							customer.getCustomerName()))
					.add(Restrictions.eq("customerPass",
							customer.getCustomerPass()));
			System.out.println(criteria);
			List<Customer> list = criteria.list();
			if (list.isEmpty()) {
				return false;
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return true;

	}

	/*
	 * public Customer getModel() { // TODO Auto-generated method stub return
	 * customer; }
	 */

}
