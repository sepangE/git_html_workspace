package com.java.www;
import java.sql.Timestamp;
public class MemberDto {
	// Member클래스
	private String id;
	private String pw;
	private String name;
	private String phone;
	private String gender;
	private String hobby;
	private Timestamp jdate;
	public MemberDto() {}
	public MemberDto(String id, String pw) {
		this.id = id; this.pw = pw;
	}
	public MemberDto(String id, String pw, String name, String phone, String gender, String hobby ) {
		this.id = id;		this.pw = pw;		this.name = name;
		this.phone = phone;		this.gender = gender;
		this.hobby = hobby;	
	}
	public MemberDto(String id, String pw, String name, String phone, String gender, String hobby, Timestamp jdate) {
		this.id = id;	this.pw = pw;	this.name = name;
		this.phone = phone;	this.gender = gender;
		this.hobby = hobby;	this.jdate = jdate;
	}
	// getter setter
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public Timestamp getJdate() {
		return jdate;
	}
	public void setJdate(Timestamp jdate) {
		this.jdate = jdate;
	}
}
