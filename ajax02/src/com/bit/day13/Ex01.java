package com.bit.day13;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Ex01 implements Servlet{
	ServletConfig config;

	@Override
	public void destroy() {
		System.out.println("Ex01 class destroy...");
	}

	@Override
	public ServletConfig getServletConfig() {
		return config;
	}

	@Override
	public String getServletInfo() {
		return "bit01class";
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		config=arg0;
		System.out.println("Ex01 class init...");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		System.out.println("Ex01 class service...");
		
		
		res.setContentType("text/html; charset=UTF-8"); 
		PrintWriter out = res.getWriter();
		out.println("<h1>이제 한글도 잘 출력</h1>");
		out.println("close");
		out.flush();
		out.close();
	}

}




















