<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="com.bit.day45.bbs.MyOra, java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="user05Bean" class="com.bit.day45.bbs.UserBean" scope="session"></jsp:useBean>
	<jsp:setProperty property="*" name="user05Bean"/>
	<%
	
	String sql="SELECT NUM FROM USER05 WHERE ID=? AND PW=?";
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	String path="login.jsp";
	try{
		MyOra my=new MyOra();
		conn=my.getConnection();
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, user05Bean.getId());
		pstmt.setString(2, user05Bean.getPw());
		rs=pstmt.executeQuery();
		if(rs.next()){
			user05Bean.setNum(rs.getInt("num"));
			path="index.jsp";
		}
	}finally{
		if(rs!=null)rs.close();
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
	}
	response.sendRedirect(path);
	%>
</body>
</html>

















