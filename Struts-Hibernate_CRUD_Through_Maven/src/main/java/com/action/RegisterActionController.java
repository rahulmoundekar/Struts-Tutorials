package com.action;

import java.util.ArrayList;
import java.util.List;

import com.dao.CommonCode;
import com.model.Customer;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.RegisterCheck;
import com.serviceImpl.RegisterCustomerServiceImpl;

public class RegisterActionController extends ActionSupport implements ModelDriven<Customer> {
Customer customer=new Customer();
List<Customer> al;
	

	public List<Customer> getAl() {
	return al;
}
public void setAl(List<Customer> al) {
	this.al = al;
}
	public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
	public Customer getModel() {
		// TODO Auto-generated method stub
		return customer;
	}
	public String registerCust(){
		System.out.println("RegisterAction");
		System.out.println(customer.getCustomerName());
		RegisterCheck rc=new RegisterCustomerServiceImpl();
		rc.regi(customer);
		CommonCode c=new CommonCode();
		al=c.commonData();
		return SUCCESS;
	}

}
