package com.bit.day15.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.day15.model.Emp01Dao;

public class AddController extends HttpServlet{
	// /insert.bit
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// get param
		req.setCharacterEncoding("utf-8");
		String name=req.getParameter("name");
		int pay=Integer.parseInt(req.getParameter("pay"));
		
		// dao
		Emp01Dao dao=new Emp01Dao();
		int su=dao.insertOne(name, pay);
		
		// list.bit page redirect
		if(su>0) resp.sendRedirect("list.bit?result='success'");
		else resp.sendRedirect("list.bit?result='failure'");
	}
}




















