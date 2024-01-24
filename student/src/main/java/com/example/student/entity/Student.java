package com.example.student.entity;

import java.util.List;



public class Student {
	 private int stuid;
	 private String stuname;
	 List<Address> addresses;
	public Student(int stuid, String stuname, List<Address> addresses) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.addresses = addresses;
	}
	public Student(int stuid, String stuname) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
	}
	public Student() {
		super();
	}
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	 
}
