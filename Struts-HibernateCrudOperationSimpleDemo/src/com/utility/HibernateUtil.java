package com.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	//private static SessionFactory factory=null;
	private static SessionFactory factory=getSessionFactory();

private static  synchronized SessionFactory getSessionFactory() {
	// TODO Auto-generated method stub
	try {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=cfg.buildSessionFactory();
	System.out.println("sessionFactory object created");
		return 	 sessionFactory;
	} catch (Throwable ex) {
		System.out.println("initial sessionfactory  creation failed");
		throw new ExceptionInInitializerError(ex);
		// TODO: handle exception
		
	}
	
}
public static SessionFactory getFactory(){
	return factory;
}
}
