package com;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class LoginEx  extends ActionSupport implements Preparable{

	private String uname,upass;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("PreparationLogic");
	}
public String execute() throws Exception {
	System.out.println("actual logic");
	return SUCCESS;};
}