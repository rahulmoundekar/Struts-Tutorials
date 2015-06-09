package com.action;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.demo.Mybean;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ActionController extends ActionSupport implements ServletRequestAware,ApplicationAware {
	   private static final long serialVersionUID = 1L;

MyOperations ma=new MyOperations();
Mybean mb;
public Mybean getMb() {
	return mb;
}

public void setMb(Mybean mb) {
	this.mb = mb;
}
Map m;
private List<Mybean> recordsFromDB;
//for bean while Selecting
	public List<Mybean> getRecordsFromDB() {
	return this.recordsFromDB;
}

	@Override
	public void setApplication(Map m) {
		// TODO Auto-generated method stub
		this.m=m;
	}
//for RequestAware Interface
	HttpServletRequest request;
	public HttpServletRequest getRequest() {
		return request;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request=request;
		
	}

	/*@Override
	public Mybean getModel() {
		// TODO Auto-generated method stub
		return mb;
	}*/
	//for select query
	public String getRecords(){
	recordsFromDB	=ma.retrieveRecords();
	request.setAttribute("rec",recordsFromDB );
	return SUCCESS;
		
	}
	//for Update Query
	public String getRecordToUpdate(){
		recordsFromDB =ma.retrieveRecord(request.getParameter("fid"));
		   Iterator<Mybean>     itr      =recordsFromDB.iterator();
		   while(itr.hasNext()){
			  Object o =itr.next();
			  mb=(Mybean)o;
		   }
		   m.put("x", mb.getNo());
		   m.put("y",mb.getNam());
		   m.put("z", mb.getCt());
		return SUCCESS;
		
	}
	//insert method
	public String insertRecord(){
		ma.insertRecord(mb);
		
		return SUCCESS;
	}
//UPDATE IN DATABASE
	public String updateRec(){
		ma.upRecord(mb);
		return SUCCESS;
		
	}
	public String deleteRecord(){
		String cv[]=null;
		cv=request.getParameterValues("rdel");
		ma.deleteRecord(cv);
		return SUCCESS;
		
	}
}
