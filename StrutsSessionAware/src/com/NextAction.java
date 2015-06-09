package com;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class NextAction extends ActionSupport implements SessionAware {
Map m;
	@Override
	public void setSession(Map m) {
		this.m=m;
		
	}
	@Override
		public String execute() throws Exception {
			return SUCCESS;
		}

}
