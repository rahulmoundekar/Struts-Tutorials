package com.demo;

// Generated 25 May, 2015 4:16:32 PM by Hibernate Tools 3.4.0.CR1

/**
 * Mybean generated by hbm2java
 */
public class Mybean implements java.io.Serializable {

	private Integer no;
	private String nam;
	private String ct;

	public Mybean() {
	}

	public Mybean(String nam, String ct) {
		this.nam = nam;
		this.ct = ct;
	}

	public Integer getNo() {
		return this.no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getNam() {
		return this.nam;
	}

	public void setNam(String nam) {
		this.nam = nam;
	}

	public String getCt() {
		return this.ct;
	}

	public void setCt(String ct) {
		this.ct = ct;
	}

}
