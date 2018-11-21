<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*,com.bit.day45.bbs.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="bean" class="com.bit.day45.bbs.JavaBean"></jsp:useBean>
	<jsp:setProperty property="sub" name="bean"/>
	<jsp:setProperty property="name" name="bean"/>
	<jsp:setProperty property="content" name="bean"/>
	
	<%
	/* 
	String param1=request.getParameter("sub");
	String param2=request.getParameter("name");
	String param3=request.getParameter("content");
	
	JavaBean bean=new JavaBean();
	bean.setName(param2);
	bean.setSub(param1);
	bean.setContent(param3);
	 */
	String sql="INSERT INTO BBS05 VALUES (BBS05_SEQ.NEXTVAL,?,?,?,SYSDATE)";
	
	Connection conn=null;
	PreparedStatement pstmt=null;
	
	try{
		MyOra my=new MyOra();
		conn=my.getConnection();
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, bean.getName());
		pstmt.setString(2, bean.getSub());
		pstmt.setString(3, bean.getContent());
		pstmt.executeUpdate();
	}finally{
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
	}
	response.sendRedirect("index.jsp");
	%>
</body>
</html>





















