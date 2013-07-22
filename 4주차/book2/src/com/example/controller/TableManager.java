package com.example.controller;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
import java.lang.*;

import com.example.model.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SuppressWarnings("serial")
public class TableManager extends HttpServlet {
	UserTable userTable = new UserTable();
	ApplicationContext context = null;
	private TableManagerl tableManagerl = null;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		//join.jsp �κ��� ��û�� ������ ����. �Է¹��� name,name1,phone ���� ������ ���̺� �߰�.

	UserTable userTable = tableManagerl.run(request, response);
	
	//"table" �̶�� Attribute(�Ӽ�)�� ���� ����
	request.setAttribute("table", userTable.getUserTable());
	//jsp�� �۾��� ��Ź�� RequestDispatcher�� �ν��Ͻ�ȭ
	RequestDispatcher view = request.getRequestDispatcher("userTable.jsp");
	//RequestDispatcher�� �����̳ʿ��� jsp�� �غ��϶�� ��û�Ѵ��� jsp���� request, response ��ü�� �ѱ��.
	view.forward(request, response);

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.setAttribute("table", userTable.getUserTable());
		RequestDispatcher view = request.getRequestDispatcher("userTable.jsp");
		view.forward(request, response);
	}
	
	public void init() throws ServletException {
		context = (ApplicationContext)getServletContext().getAttribute("context");
		tableManagerl = (TableManagerl)context.getBean("tableManager");
	}

}