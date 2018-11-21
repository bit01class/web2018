<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user05Bean" class="com.bit.day45.bbs.UserBean" scope="session"></jsp:useBean>
<jsp:setProperty property="num" name="user05Bean" value="0"/>
<jsp:setProperty property="id" name="user05Bean" value="guest"/>
<jsp:setProperty property="pw" name="user05Bean" value=""/>

	<%
	 response.sendRedirect("index.jsp");
	%>
</body>
</html>