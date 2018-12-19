package com.bit.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(
		urlPatterns={"/intro.do","/intro.bit"},
		initParams={
				@WebInitParam(name="msg",value="intro page"),
				@WebInitParam(name="msg2",value="intro page")
		}
)
public class IntroContoller extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String msg=getInitParameter("msg");
		System.out.println(msg);
		req.getRequestDispatcher("intro.jsp").forward(req, resp);
	}
}








