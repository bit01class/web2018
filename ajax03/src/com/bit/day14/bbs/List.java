package com.bit.day14.bbs;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class List extends HttpServlet {
// list.json
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.setContentType("application/json; charset=\"utf-8\"");
		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		out.println("{\"bbs\":[");
		String sql="select * from bbs05 order by num desc";
		Connection conn = null;
		int cnt=0;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				if(cnt++!=0)out.print(",");
				out.print("{");
				out.print("\"num\":"+rs.getInt("num"));
				out.print(",\"name\":\""+rs.getString("name")+"\"");
				out.print(",\"sub\":\""+rs.getString("sub")+"\"");
				out.print(",\"content\":\""+rs.getString("content")+"\"");
				out.print(",\"nalja\":\""+rs.getDate("nalja").toString()+"\"");
				out.println("}");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
				try {
					if(conn!=null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		out.println("]}");
		out.close();
	}
}





















