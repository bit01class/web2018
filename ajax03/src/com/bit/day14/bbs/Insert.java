package com.bit.day14.bbs;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Insert extends HttpServlet{
// insert.bit
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("step1");
		req.setCharacterEncoding("utf-8");
		String sub=req.getParameter("sub");
		String name=req.getParameter("name");
		String content=req.getParameter("content");
		
		System.out.println("step2");
		String sql="insert into bbs05 values ((select max(num)+1 from bbs05),?,?,?,sysdate)";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try(Connection conn=DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger")){
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, sub);
			pstmt.setString(3, content);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("step3");
		resp.sendRedirect("list.html");
	}
}














