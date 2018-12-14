package com.bit.day16.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.day16.model.Emp02Dao;

public class DeleteController extends HttpServlet {
// /delete.bit
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		int sabun=Integer.parseInt(req.getParameter("sabun"));

		Emp02Dao dao = new Emp02Dao();
		try {
			dao.delOne(sabun);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}


















