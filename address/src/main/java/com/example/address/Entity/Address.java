package com.example.address.Entity;

public class Address {
	private int aid;
	private String city;
	private int pincode;
	private int stuid;
	public Address(int aid, String city, int pincode, int stuid) {
		super();
		this.aid = aid;
		this.city = city;
		this.pincode = pincode;
		this.stuid = stuid;
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
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	
}
