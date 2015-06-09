package com;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {
Map m;
private String uname,uage,ucountry;
public Map getM() {
	return m;
}
public void setM(Map m) {
	this.m = m;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUage() {
	return uage;
}
public void setUage(String uage) {
	this.uage = uage;
}
public String getUcountry() {
	return ucountry;
}
public void setUcountry(String ucountry) {
	this.ucountry = ucountry;
}
public int getUmarks() {
	return umarks;
}
public void setUmarks(int umarks) {
	this.umarks = umarks;
}
private int umarks;
	@Override
	public void setSession(Map m) {
		// TODO Auto-generated method stub
		this.m=m;
	}
@Override
	public String execute() throws Exception {
		m.put("un", uname);
		m.put("age",uage );
		m.put("marks", umarks);
		m.put("country", ucountry);
		return SUCCESS;
		
	}
}
