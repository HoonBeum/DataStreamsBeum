package com.example.controller;

import javax.servlet.*;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class listener implements ServletContextListener{
	@Override
	public void contextInitialized(ServletContextEvent event) {
		// ���ý�Ʈ �ʱ�ȭ �� ���ý�Ʈ �Ӽ��� ����
			ServletContext sc = event.getServletContext();
			String path = sc.getInitParameter("springConfig");
			ApplicationContext context = new FileSystemXmlApplicationContext(path);
			
			sc.setAttribute("context", context);
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent event) {
		// ���ø����̼��� ���� �Ҷ� ����� �ڿ� ����
	}
}
