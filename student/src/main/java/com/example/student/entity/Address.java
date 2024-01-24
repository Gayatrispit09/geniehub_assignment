package com.example.student.entity;

public class Address {
	private int aid;
	private String city;
	private int pincode;
	public Address(int aid, String city, int pincode) {
		super();
		this.aid = aid;
		this.city = city;
		this.pincode = pincode;
	}
	public Address() {
		super();
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
}
