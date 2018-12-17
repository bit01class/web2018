package com.bit.day17.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.day17.model.Emp03Dao;

public class AddController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		
		String path=getInitParameter("path");
		String name=this.getInitParameter("name");
		req.getRequestDispatcher(path+name).forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String sub=req.getParameter("sub");
		String content=req.getParameter("content");
		int unum=3;
		
		Emp03Dao dao = new Emp03Dao();
		
		try {
			dao.insertOne(sub,content,unum);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
		resp.sendRedirect("list.do");
	}
}










































