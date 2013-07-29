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
		//join.jsp 로부터 요청을 받으면 동작. 입력받은 name,name1,phone 값을 가져와 테이블에 추가.

	UserTable userTable = tableManagerl.run(request, response);
	
	//"table" 이라는 Attribute(속성)에 값을 설정
	request.setAttribute("table", userTable.getUserTable());
	//jsp로 작업을 부탁할 RequestDispatcher를 인스턴스화
	RequestDispatcher view = request.getRequestDispatcher("userTable.jsp");
	//RequestDispatcher는 컨테이너에게 jsp를 준비하라고 요청한다음 jsp에게 request, response 객체를 넘긴다.
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