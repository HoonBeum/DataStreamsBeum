package com.example.UserTable;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.example.model.UserTable;

@SuppressWarnings("serial")
public class TableManager implements Controller {
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO 자동 생성된 메소드 스텁
		//join.jsp 로부터 요청을 받으면 동작. 입력받은 name,age,phone 값을 가져와 테이블에 추가.
		/*
		context = (ApplicationContext)request.getSession().getServletContext().getAttribute("context");
		tableHandling = (TableHandling)context.getBean("tableHandling");
		userTable = (UserTable)context.getBean("userTable");
		*/
		UserTable userTable = new UserTable();																																																																										
		//request.setCharacte	rEncoding("UTF-8");
		if(request.getParameter("name") != null && request.getParameter("name1") != null && request.getParameter("phone") != null){
		String name = request.getParameter("name");
		String name1 = request.getParameter("name1");
		int phoneNumber = Integer.parseInt(request.getParameter("phone"));
		userTable.setUserTable(name, name1, phoneNumber);
		}
		
		ModelAndView mav = new ModelAndView("userTable");
        mav.addObject("table", userTable.getUserTable());
        return mav;
	}

}