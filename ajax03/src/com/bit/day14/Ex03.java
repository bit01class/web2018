package com.bit.day14;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex03 extends HttpServlet{
	//ex03.bit

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("Post방식");
		req.setCharacterEncoding("utf-8");
		String id=req.getParameter("id");
		String pw=req.getParameter("pw");
		boolean result=false;
		String name="손님";
		
		if("admin".equals(id) && "1234".equals(pw)){
			result=true;
			name="관리자";
		}
		
//		resp.setContentType("text/json; charset=\"utf-8\"");
//		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		out.println("{\"login\":[");
		out.println("{\"result\":"+result+",\"name\":\""+name+"\"}");
		out.println("]}");
		out.close();
	}
}






















