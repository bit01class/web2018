package com.bit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginContoller
 */
@WebServlet("/login.json")
public class LoginContoller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		System.out.println("id:"+id+", pw:"+pw);
		String name="°ü¸®ÀÚ";
		boolean result=false;
		
		if(id.equals("admin")&&pw.equals("1234")){
			result=true;
			HttpSession session = request.getSession();
			session.setAttribute("name", name);
		}
		
		response.setContentType("application/json; charset=\"utf-8\"");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		out.print("{\"root\":");
		if(result){
			out.print("[{");
			out.print("\"id\":\""+id+"\"");
			out.print(",\"name\":\""+name+"\"");
			out.print("}]");
		}else{
			out.print("null");
		}
		out.print("}");
		out.close();
	}

}























