package com;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateUserAction  extends ActionSupport{
@Override
public String execute() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("control comes in Action Class");
	setUpdateTime(new Date());
	return SUCCESS;																																			
}
@Override
	public void validate() {
		if(name.equals("")){
			addActionError("Name cant be blank");
		}
		if(name.equals("")){
			addActionError("Address cant be blank");
		}
	}
private String name;
private String address;
private Date updateTime;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Date getUpdateTime() {
	return updateTime;
}
public void setUpdateTime(Date updateTime) {
	this.updateTime = updateTime;
}

}
