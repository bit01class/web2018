<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*,com.bit.day45.bbs.MyOra"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="bean" class="com.bit.day45.bbs.JavaBean" scope="request"></jsp:useBean>
	<jsp:setProperty property="num" name="bean"/>
	
	<%
		String view=request.getParameter("view");
		view+=".jsp";
		String sql="SELECT * FROM BBS05 WHERE NUM=?";
	
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try{
			MyOra my=new MyOra();
			conn=my.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, bean.getNum());
			rs=pstmt.executeQuery();
			if(rs.next()){
				bean.setSub(rs.getString("sub"));
				bean.setName(rs.getString("name"));
				bean.setContent(rs.getString("content"));
				bean.setNalja(rs.getDate("nalja"));
			}
		}finally{
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
	%>
	<jsp:forward page="<%=view %>"></jsp:forward>

</body>
</html>



















