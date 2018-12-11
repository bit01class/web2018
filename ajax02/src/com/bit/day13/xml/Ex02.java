package com.bit.day13.xml;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex02 extends HttpServlet{
// ex02.xml
	String[] names={
			"sm1.jpg","sm2.jpg","sm3.jpg",
			"sm4.jpg","sm5.jpg","sm6.jpg"
	};
	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			resp.setContentType("application/xml; charset=\"utf-8\"");
			resp.setCharacterEncoding("utf-8");
			PrintWriter out = resp.getWriter();
			out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			out.println("<imgs>");
			for(int i=0; i<names.length; i++){
				out.println("<img>");
					out.println("<name>"+names[i]+"</name>");
					out.println("<path>http://localhost:8080/ajax02/imgs/</path>");
				out.println("</img>");
			}
			out.println("</imgs>");
			out.close();
		}
}














