package com.bit.day13;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex04 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		
		HttpServletRequest request=(HttpServletRequest)req;
		HttpServletResponse response= (HttpServletResponse)res;
		
		String method=request.getMethod();
		
		if("POST".equals(method)){
			response.setContentType("text/html; charset=\"UTF-8\""); 
			response.setCharacterEncoding("UTF-8");
			
			PrintWriter out = response.getWriter();
			
			out.println("<!doctype html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<meta charset=\"UTF-8\">");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>");
			out.println("서블릿을 이용한 웹페이지");
			out.println("</h1>");
			out.println("<p>");
			out.println("id:"+request.getParameter("id"));
			out.println("</p>");
			out.println("</body>");
			out.println("</html>");
			out.close();
		}else{
			response.sendError(405);
		}
	}

}
















