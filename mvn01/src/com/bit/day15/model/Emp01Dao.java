package com.bit.day15.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Emp01Dao {
	private final String driver="oracle.jdbc.OracleDriver";
	private final String url="jdbc:oracle:thin:@localhost:1521:xe";
	private final String user="scott";
	private final String password="tiger";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public ArrayList<Emp01Dto> selectAll(){
		ArrayList<Emp01Dto> list = new ArrayList<Emp01Dto>();
		
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
			pstmt=conn.prepareStatement("select * from emp01");
			rs=pstmt.executeQuery();
			while(rs.next()){
				Emp01Dto dto= new Emp01Dto();
				dto.setSabun(rs.getInt("sabun"));
				dto.setName(rs.getString("name"));
				dto.setNalja(rs.getDate("nalja"));
				dto.setPay(rs.getInt("pay"));
				list.add(dto);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
				try {
					if(rs!=null) rs.close();
					if(pstmt!=null) pstmt.close();
					if(conn!=null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return list;
	}
	
	
	public int insertOne(String name, int pay){
		String sql="INSERT INTO EMP01 VALUES (EMP01_SEQ.NEXTVAL,?,SYSDATE,?)";
		int su=0;
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, pay);
			su=pstmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return su;
	}
	
	public Emp01Dto selectOne(int sabun){
		String sql="SELECT * FROM EMP01 WHERE SABUN=?";
		Emp01Dto dto = new Emp01Dto();
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, sabun);
			rs=pstmt.executeQuery();
			if(rs.next()){
				dto.setSabun(rs.getInt("sabun"));
				dto.setName(rs.getString("name"));
				dto.setNalja(rs.getDate("nalja"));
				dto.setPay(rs.getInt("pay"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return dto;
	}
	
	public int updateOne(int sabun,String name,int pay){
		int su=0;
		String sql="UPDATE EMP01 SET NAME=?,PAY=? WHERE SABUN=?";
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, pay);
			pstmt.setInt(3, sabun);
			su=pstmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return su;
	}
}




















