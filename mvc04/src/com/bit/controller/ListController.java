package com.bit.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.Emp03Dao;
import com.bit.model.Emp03Dto;

@WebServlet("/bbs/list.do")
public class ListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Emp03Dao dao=new Emp03Dao();
		try {
			ArrayList<Emp03Dto> list = dao.selectAll();
			for(Emp03Dto bean: list){
				System.out.println(bean.getSub());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("../list.jsp").forward(request, response);
	}

}
