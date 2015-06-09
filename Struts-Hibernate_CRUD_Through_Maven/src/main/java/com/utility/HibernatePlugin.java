package com.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernatePlugin {
	private static SessionFactory factory=getSessionFactory();

	private static  synchronized SessionFactory getSessionFactory() {
	
		// TODO Auto-generated method stub
		try {
			Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
			
			@SuppressWarnings("deprecation")
			SessionFactory sessionFactory=cfg.buildSessionFactory();
		System.out.println("sessionFactory object created");
			return 	 sessionFactory;
		} catch (Throwable ex) {
			ex.printStackTrace();
			System.out.println("initial sessionfactory  creation failed");
			throw new ExceptionInInitializerError(ex);
			// TODO: handle exception
			
		}
		
	}
	public static SessionFactory getFactory(){
		return factory;
	}
}
