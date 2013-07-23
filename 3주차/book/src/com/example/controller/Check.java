package com.example.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class Check
 */
@WebFilter("/Check")
public class Check implements Filter {

    /**
     * Default constructor. 
     */
    public Check() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

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
	
		
		// pass the request along the filter chain
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
