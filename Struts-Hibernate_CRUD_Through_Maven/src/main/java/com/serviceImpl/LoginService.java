package com.serviceImpl;

import com.dao.CustomerLoginDao;
import com.daoImpl.CustomerLoginDaoImpl;
import com.model.Customer;
import com.service.LoginCheck;

public class LoginService implements LoginCheck{

	public boolean loginCheck(Customer customer) {
		// TODO Auto-generated method stub
		CustomerLoginDao cld=new CustomerLoginDaoImpl();
		boolean b=cld.customerLoginCheck(customer);
		return b;
	}

}
