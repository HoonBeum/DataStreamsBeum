package com.example.UserTable;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.model.UserTable;

public class Checkl {
	public void run(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		UserTable userTable = new UserTable();
		HttpSession session = ((HttpServletRequest)request).getSession(false);
	
		String Id = "hb9301";
		String Password = "hb15642";
		String id = request.getParameter("id");
		String password = request.getParameter("password");


		if(((HttpServletRequest)request).getSession(false) == null){
			if(Id.equals(id) && Password.equals(password)){
				((HttpServletRequest)request).getSession();
				((HttpServletResponse)response).sendRedirect("JoinUser");
				//리다이렉트
			}
			else
			  {
				RequestDispatcher view = request.getRequestDispatcher("Login.jsp");
				view.forward(request, response);
			  }
		}
		else{
			chain.doFilter(request, response);			
		}
	}
}
