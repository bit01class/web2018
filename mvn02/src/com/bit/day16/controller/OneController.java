package com.bit.day16.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.day16.model.Emp02Dao;

public class OneController extends HttpServlet {
// select.bit
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		int sabun=Integer.parseInt(req.getParameter("idx"));
		
		Emp02Dao dao=new Emp02Dao();
		
		try {
			req.setAttribute("bean", dao.selectOne(sabun));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		RequestDispatcher rd = req.getRequestDispatcher("./bbs/detail.jsp");
		rd.forward(req, resp);
	}
	
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			// TODO Auto-generated method stub
			super.doPost(req, resp);
			System.out.println("update ½ÇÇà");
		}
}





































