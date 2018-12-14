package com.bit.day16.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Emp02Dao {
	private final String driver="oracle.jdbc.OracleDriver";
	private final String url="jdbc:oracle:thin:@localhost:1521:xe";
	private final String user="scott";
	private final String password="tiger";
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private void myConnection(){
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("ojbc14�� �� ��� Ȯ���� ��");
		} catch (SQLException e) {
			System.out.println("url, user, password Ȯ���� ��");
		}
	}
	
	// ����Ʈ
	public ArrayList<Emp02Dto> selectAll() throws SQLException{
		ArrayList<Emp02Dto> list= new ArrayList<Emp02Dto>();
		String sql="SELECT * FROM EMP02";
		myConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				Emp02Dto dto=new Emp02Dto();
				dto.setSabun(rs.getInt("sabun"));
				dto.setName(rs.getString("name"));
				dto.setNalja(rs.getDate("nalja"));
				dto.setPay(rs.getInt("pay"));
				dto.setCnt(rs.getInt("cnt"));
				list.add(dto);
			}
		}finally{
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
	// ��
	public Emp02Dto selectOne(int sabun) throws SQLException{
		Emp02Dto dto=new Emp02Dto();
		String sql="SELECT * FROM EMP02 WHERE SABUN=?";
		myConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, sabun);
			rs=pstmt.executeQuery();
			if(rs.next()){
				dto.setSabun(rs.getInt("sabun"));
				dto.setName(rs.getString("name"));
				dto.setNalja(rs.getDate("nalja"));
				dto.setPay(rs.getInt("pay"));
				dto.setCnt(rs.getInt("cnt"));
			}
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
	// �Է�
	
	public int insertOne(String name,int pay) throws SQLException{
		String sql="INSERT INTO EMP02 VALUES (EMP02_SEQ.NEXTVAL,?,SYSDATE,?,0)";
		myConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, pay);
			return pstmt.executeUpdate();
		} finally{
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	//����
	public int updateOne(String name, int pay, int sabun) throws SQLException{
		String sql="UPDATE EMP02 SET NAME=?,PAY=? WHERE SABUN=?";
		myConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, pay);
			pstmt.setInt(3, sabun);
			return pstmt.executeUpdate();
		} finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	// ����
	public int delOne(int sabun) throws SQLException{
		String sql="DELETE FROM EMP02 WHERE SABUN=?";
		myConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, sabun);
			return pstmt.executeUpdate();
		} finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}





















