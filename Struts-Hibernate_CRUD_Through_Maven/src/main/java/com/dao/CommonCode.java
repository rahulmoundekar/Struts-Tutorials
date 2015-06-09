package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Customer;
import com.utility.HibernatePlugin;

public class CommonCode {
	List<Customer>  check;
	public List<Customer> commonData(){
		try {
			SessionFactory factory=HibernatePlugin.getFactory();
			Session session=factory.openSession();
			Criteria criteria=session.createCriteria(Customer.class);
			check=criteria.list();
			System.out.println("al in Commoncode"+check);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("al in Commoncode"+check);
		return check;
	
		

		
	}

}
