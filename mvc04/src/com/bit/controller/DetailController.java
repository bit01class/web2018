package com.bit.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.Emp03Dao;

@WebServlet("/bbs/detail.do")
public class DetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sabun=Integer.parseInt(request.getParameter("idx"));
		
		Emp03Dao dao = new Emp03Dao();
		try {
			request.setAttribute("bean", dao.selectOne(sabun));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("../detail.jsp").forward(request, response);
		
	}

}
