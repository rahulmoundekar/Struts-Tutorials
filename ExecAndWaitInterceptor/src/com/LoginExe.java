package com;

import com.opensymphony.xwork2.ActionSupport;

public class LoginExe extends ActionSupport {
	private String uname;
	private String pw;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
@Override
public String execute() throws Exception {
	// TODO Auto-generated method stub
	return SUCCESS;
}
}  
