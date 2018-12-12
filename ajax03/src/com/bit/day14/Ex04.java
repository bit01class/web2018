package com.bit.day14;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex04 extends HttpServlet{
//ex04.jsonp
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String callback=req.getParameter("callback");
		
		String msg="({\"id\":\"root\",\"name\":\"»ç¿ëÀÚ\"})";
		
		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		out.println(callback+msg);
		System.out.println(callback+msg);
		out.close();
	}
}








