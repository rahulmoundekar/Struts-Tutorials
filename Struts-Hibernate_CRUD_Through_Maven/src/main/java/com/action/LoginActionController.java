package com.action;

import java.util.ArrayList;
import java.util.List;

import com.dao.CommonCode;
import com.model.Customer;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.LoginCheck;
import com.serviceImpl.LoginService;

public class LoginActionController extends ActionSupport implements ModelDriven<Customer> {
 Customer customer=new Customer();
 

List<Customer> al=new ArrayList<Customer>();



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
	public String login(){
		System.out.println("In LoginAction");
		LoginCheck ls=new LoginService();
		boolean b=ls.loginCheck(customer);
		System.out.println("Lets Check");
		if(b){
			System.out.println("common code");
			CommonCode cd=new CommonCode();
		
			
			 al=cd.commonData();
		System.out.println("al in LoginAction"+al);
		return SUCCESS;
      }
		
		return ERROR ;
	}

}
