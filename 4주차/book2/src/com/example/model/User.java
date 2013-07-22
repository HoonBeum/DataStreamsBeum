package com.example.model;

public class User {
	private String name;
	private String name1;
	private int phoneNumber;
	
	public void setUser(String name, String name1, int phoneNumber) {
		this.name = name;
		this.name1 = name1;
		this.phoneNumber = phoneNumber;		
	}
	public String getName() {
		return name;
	}
	public String getName1() {
		return name1;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}

}