package com.bit.day13;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public abstract class Ex02 implements Servlet{
	ServletConfig config;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		config=arg0;
	}

	@Override
	public abstract void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException ;

}
















