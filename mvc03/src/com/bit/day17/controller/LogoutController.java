package com.bit.day17.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession session = req.getSession();
//		session.setAttribute("result", false);
//		session.setAttribute("id", "guest");
//		session.setAttribute("unum", 0);
		session.invalidate();
		req.getRequestDispatcher("/login/logout.jsp").forward(req, resp);
	}
}

















