package com.serviceImpl;

import com.dao.RegisterDao;
import com.daoImpl.RegisterDaoImpl;
import com.model.Customer;
import com.service.RegisterCheck;

public class RegisterCustomerServiceImpl implements RegisterCheck {

	public void regi(Customer customer) {
		// TODO Auto-generated method stub
		RegisterDao rd=new RegisterDaoImpl();
		rd.registerUser(customer);
		
	}
	

}
