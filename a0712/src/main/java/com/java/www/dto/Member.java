package com.java.www.dto;

import java.sql.Timestamp;

public class Member {
	private int mno;
	private String name,id,pw,email,addr,phone,gender;
	private Timestamp bdate;
	
	public Member(){}
	public Member(String name, String id, String pw, String email, String addr, String phone, String gender,
			Timestamp bdate) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.email = email;
		this.addr = addr;
		this.phone = phone;
		this.gender = gender;
		this.bdate = bdate;
	}
	public Member(int mno, String name, String id, String pw, String email, String addr, String phone, String gender,
			Timestamp bdate) {
		this.mno = mno;
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.email = email;
		this.addr = addr;
		this.phone = phone;
		this.gender = gender;
		this.bdate = bdate;
	}
	// getter setter
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Timestamp getBdate() {
		return bdate;
	}
	public void setBdate(Timestamp bdate) {
		this.bdate = bdate;
	}
	
}
