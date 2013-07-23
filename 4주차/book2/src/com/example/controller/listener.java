package com.example.controller;

import javax.servlet.*;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class listener implements ServletContextListener{
	@Override
	public void contextInitialized(ServletContextEvent event) {
		// 컨택스트 초기화 후 컨택스트 속성에 저장
			ServletContext sc = event.getServletContext();
			String path = sc.getInitParameter("springConfig");
			ApplicationContext context = new FileSystemXmlApplicationContext(path);
			
			sc.setAttribute("context", context);
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent event) {
		// 애플리케이션을 종료 할때 사용한 자원 정리
	}
}
