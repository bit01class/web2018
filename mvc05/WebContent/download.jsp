<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>다운로드</h1>
	<a href="up/<%=request.getAttribute("fname")%>"><%=request.getAttribute("origin")%></a>
</body>
</html>