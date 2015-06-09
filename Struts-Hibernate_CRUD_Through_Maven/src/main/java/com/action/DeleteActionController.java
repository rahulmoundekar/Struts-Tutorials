package com.action;

import java.util.ArrayList;
import java.util.List;

import com.dao.CommonCode;
import com.model.Customer;
import com.opensymphony.xwork2.ActionSupport;
import com.service.DeleteService;
import com.serviceImpl.DeleteServiceImpl;

public class DeleteActionController extends ActionSupport{
	int customer_id;
	List<Customer> al=new ArrayList<Customer>();
	public List<Customer> getAl() {
		return al;
	}
	public void setAl(List<Customer> al) {
		this.al = al;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String deleteRec(){
		System.out.println("DeleteAction"+customer_id);
		String cv[]=null;
		
		DeleteService ds=new DeleteServiceImpl();
		ds.delService(customer_id);
		CommonCode cd=new CommonCode();
		al=cd.commonData();
		return SUCCESS;
		
	}

}
