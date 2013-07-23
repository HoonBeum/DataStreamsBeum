package com.example.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.lang.*;
import com.example.model.UserTable;
import com.example.model.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TableManager extends HttpServlet {
	UserTable userTable = new UserTable();
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		//join.jsp �κ��� ��û�� ������ ����. �Է¹��� name,name1,phone ���� ������ ���̺� �߰�.
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	String name1 = request.getParameter("name1");
	int phoneNumber = Integer.parseInt(request.getParameter("phone"));
	userTable.setUserTable(name, name1, phoneNumber);
	
	//"table" �̶�� Attribute(�Ӽ�)�� ���� ����
	request.setAttribute("table", userTable.getUserTable());
	//jsp�� �۾��� ��Ź�� RequestDispatcher�� �ν��Ͻ�ȭ
	RequestDispatcher view = request.getRequestDispatcher("userTable.jsp");
	//RequestDispatcher�� �����̳ʿ��� jsp�� �غ��϶�� ��û�Ѵ��� jsp���� request, response ��ü�� �ѱ��.
	view.forward(request, response);
	//�����p

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.setAttribute("table", userTable.getUserTable());
		RequestDispatcher view = request.getRequestDispatcher("userTable.jsp");
		view.forward(request, response);
	}

}