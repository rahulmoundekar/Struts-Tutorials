package com.action;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.Mybean;
import com.opensymphony.xwork2.ModelDriven;
import com.utility.HibernateUtil;

public class MyOperations //implements ModelDriven<Mybean>
{
SessionFactory factory=HibernateUtil.getFactory();
Session session=factory.openSession();
Mybean my;


/*public Mybean getMy() {
	return my;
}
public void setMy(Mybean my) {
	this.my = my;
}*/
List< Mybean> recList=null;
public List<Mybean> retrieveRecords(){
	recList=(List<Mybean>)session.createQuery("from Mybean mb ").list();
	System.out.println("got Size"+recList.size());
	return recList;
	
}
public List<Mybean> retrieveRecord(String val){
	recList=(List<Mybean>)session.createQuery("from Mybean mb where mb.no="+val).list();
	System.out.println("got size"+recList.size());
	return recList;
	
}
public void insertRecord(Mybean my){
	Transaction tx=session.beginTransaction();
	session.save(my);
	System.out.println("Object saved successfully");
	tx.commit();
	
	
}
public void upRecord(Mybean my){
	Transaction tx=session.beginTransaction();
	Query query=session.createQuery("update Mybean mb  set mb.nam=?,mb.ct=?where mb.no="+my.getNo()) ;
	query.setParameter(0, my.getNam());
	query.setParameter(1, my.getCt());
	query.executeUpdate();
	System.out.println("object updated Successfully..");
	tx.commit();
}
public void deleteRecord(String cv[]){
	Transaction tx=session.beginTransaction();
	for(int i=0;i<cv.length;i++){
		Query query=session.createQuery("delete from Mybean mb  where mb.no="+cv[i]);
		query.executeUpdate();
	}
	System.out.println("object(s) deleted Successfully");
	tx.commit();
}
/*@Override
public Mybean getModel() {
	// TODO Auto-generated method stub
	return my;
}*/
}
