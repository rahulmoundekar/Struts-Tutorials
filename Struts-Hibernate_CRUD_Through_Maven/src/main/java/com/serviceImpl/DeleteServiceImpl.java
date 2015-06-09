package com.serviceImpl;

import com.dao.DeleteDao;
import com.daoImpl.DeleteDaoImpl;
import com.service.DeleteService;

public class DeleteServiceImpl implements DeleteService {

	public void delService(int customer_id) {
		// TODO Auto-generated method stub
		DeleteDao dd=new DeleteDaoImpl();
		dd.deleteCustomer(customer_id);
	}

}
