package com.example.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.UserTable;

public class TableManagerl {
	UserTable userTable = new UserTable();
		public UserTable run(HttpServletRequest request, HttpServletResponse response) throws IOException {
	
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String name1 = request.getParameter("name1");
		int phoneNumber = Integer.parseInt(request.getParameter("phone"));
		userTable.setUserTable(name, name1, phoneNumber);
		
		return userTable;
	}
}
