package com.bit.day14;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex01 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//ex01.json
		/*
		  {"root":[
				{"id":"admin","name":"包府磊"}
			]}  
		 */
		boolean result=false;
		int num=4321;
		resp.setContentType("application/json; charset=\"utf-8\"");
		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		out.print(" {\"root\":[");
		out.print(" {\"id\":\"admin\",\"name\":\"包府磊\",\"result\":"+result+",\"num\":"+num+"}");
		out.print(" ]}  ");
		out.close();
	}
}








