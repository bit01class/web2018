package com.bit.day16.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.day16.model.Emp02Dao;

public class ListController extends HttpServlet{
//	/list.bit
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Emp02Dao dao=new Emp02Dao();
		
		try {
			req.setAttribute("list", dao.selectAll());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		RequestDispatcher rd = req.getRequestDispatcher("./bbs/list.jsp");
		rd.forward(req, resp);
	}
}




















