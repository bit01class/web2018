package com.bit.day13;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex07 extends Ex05 {
// /ex07.html
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id=request.getParameter("id");
		
		response.setContentType("text/html; charset=\"UTF-8\"");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("	<head>");
		out.println("		<meta charset=\"utf-8\">");
		out.println("	</head>");
		out.println("	<body>");
		out.println("		<h1>id:"+id+"</h1>");
		out.println("	</body>");
		out.println("</html>");
		out.close();
	}
}

















