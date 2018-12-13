package com.bit.day15.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.day15.model.Emp01Dao;
import com.bit.day15.model.Emp01Dto;

public class EditFormController extends HttpServlet{
	// /edit.bit
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//param
			int sabun=Integer.parseInt(req.getParameter("idx"));
		//dao
			Emp01Dao dao = new Emp01Dao();
			Emp01Dto bean = dao.selectOne(sabun);
		//setAttr
			req.setAttribute("bean", bean);
		
		//forword
			RequestDispatcher rd = req.getRequestDispatcher("edit.jsp");
			rd.forward(req, resp);
	}
}










