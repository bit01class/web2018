<%@page import="com.bit.day45.bbs.JavaBean"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="com.bit.day45.bbs.MyOra,java.sql.*,java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	
	String sql="SELECT * FROM BBS05 ORDER BY NUM DESC";
	
	ArrayList<JavaBean> list = new ArrayList<JavaBean>();
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	try{
		MyOra my=new MyOra();
		conn=my.getConnection();
		pstmt=conn.prepareStatement(sql);
		rs=pstmt.executeQuery();
		
		while(rs.next()){
			JavaBean bean = new JavaBean();
			bean.setNum(rs.getInt("num"));
			bean.setName(rs.getString("name"));
			bean.setSub(rs.getString("sub"));
			bean.setNalja(rs.getDate("nalja"));
			list.add(bean);
		}
	}finally{
		if(rs!=null)rs.close();
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
	}
%>
<p>
<jsp:useBean id="user05Bean" class="com.bit.day45.bbs.UserBean" scope="session"></jsp:useBean>
	<%if(user05Bean.getNum()==0){ %>
		<a href="login.jsp">[로그인]</a>
	<%}else{ %>
		<%=user05Bean.getId() %>님 환영합니다
		<a href="logout.jsp">[로그아웃]</a>
	<%} %>
</p>
	<h1>list page</h1>
	<table width="1024">
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>이름</th>
			<th>날짜</th>
		</tr>
		<%
		for(int i=0; i<list.size(); i++){
			JavaBean bean=list.get(i);
		%>
		<tr>
			<td><a href="detail.jsp?view=One&num=<%=bean.getNum() %>"><%=bean.getNum() %></a></td>
			<td><a href="detail.jsp?view=One&num=<%=bean.getNum() %>"><%=bean.getSub() %></a></td>
			<td><a href="detail.jsp?view=One&num=<%=bean.getNum() %>"><%=bean.getName() %></a></td>
			<td><a href="detail.jsp?view=One&num=<%=bean.getNum() %>"><%=bean.getNalja() %></a></td>
		</tr>
		<%} %>
	</table>
	<a href="add.jsp">[입 력]</a>
</body>
</html>














