package com.bit.day17.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bit.day17.util.MyOra;

public class Emp03Dao {
	
	
	
	private PreparedStatement pstmt;
	private ResultSet rs;

	public ArrayList<Emp03Dto> selectAll() throws SQLException{
		String sql="SELECT NUM,(SELECT NAME FROM USER03 WHERE NUM=UNUM) AS \"NAME\",SUB,CONTENT,NALJA,CNT FROM EMP03";
		ArrayList<Emp03Dto> list=new ArrayList<Emp03Dto>();
		try{
			pstmt=MyOra.getConnection().prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				Emp03Dto dto=new Emp03Dto();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setSub(rs.getString("sub"));
				dto.setContent(rs.getString("content"));
				dto.setNalja(rs.getDate("nalja"));
				dto.setCnt(rs.getInt("cnt"));
				list.add(dto);
			}
		}finally{
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(MyOra.getConnection()!=null)MyOra.getConnection().close();
		}
		return list;
	}
	
	public void insertOne(String sub,String content,int unum) throws SQLException{
		String sql="INSERT INTO EMP03 VALUES (EMP03_SEQ.NEXTVAL,?,?,?,SYSDATE,0)";
		try{
			pstmt=MyOra.getConnection().prepareStatement(sql);
			pstmt.setInt(1, unum);
			pstmt.setString(2, sub);
			pstmt.setString(3, content);
			pstmt.executeUpdate();
		}finally{
			if(pstmt!=null)pstmt.close();
			if(MyOra.getConnection()!=null)MyOra.getConnection().close();
		}
	}

}

















