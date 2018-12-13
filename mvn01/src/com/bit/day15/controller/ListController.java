package com.bit.day15.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.day15.model.Emp01Dao;
import com.bit.day15.model.Emp01Dto;

public class ListController extends HttpServlet {
	// /list.bit

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		// database 실행 및 결과
		Emp01Dao dao = new Emp01Dao();
		ArrayList<Emp01Dto> list = dao.selectAll();
		
		// request scope 값 전달
		req.setAttribute("alist", list);
		
		// MVC2의 화면위임
		RequestDispatcher rd = req.getRequestDispatcher("list.jsp");
		rd.forward(req, resp);
	}
}


















