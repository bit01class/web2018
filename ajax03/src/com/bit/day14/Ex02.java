package com.bit.day14;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex02 extends HttpServlet {
//ex02.json
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String[] name={
				"sm1.jpg","sm2.jpg","sm3.jpg",
				"sm4.jpg","sm5.jpg","sm6.jpg"
		};
		
		String[] title={
				"¼îÆÄ","¹°º´","¹ä±×¸©",
				"Á¢½Ã¼¼Æ®","¼ØÀÌºÒ","Ä§´ë"
		};
		
		resp.setContentType("application/json; charset=\"utf-8\"");
		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		out.println("{\"imgs\":[");
		for(int i=0; i<name.length; i++){
			if(i!=0)out.print(", ");
			out.println("{\"name\":\""+name[i]+"\" ,\"title\":\""+title[i]+"\" }");
		}
		out.println("]}");
		out.close();
	}
}




















