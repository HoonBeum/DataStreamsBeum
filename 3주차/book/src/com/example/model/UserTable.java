package com.example.model;

import java.util.*;

public class UserTable {
	static ArrayList<User> userTable = new ArrayList<User>();

	public void setUserTable(String name, String name1, int phoneNumber) {
		User user = new User();
		user.setUser(name, name1, phoneNumber);
		userTable.add(user);
	}
	
	public ArrayList getUserTable() {
		return userTable;
	}
}