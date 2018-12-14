<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList, com.bit.day16.model.Emp02Dto"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="./css/frame.css"/>
<style type="text/css">
	table{
		width: 80%;
		border-collapse: collapse;
	}
	table td{
		border: 1px solid gray;
	}
	table td>a{
		display: block;
	}
</style>
</head>
<body>
<%@ include file="../template/header.jspf" %>
<%@ include file="../template/menu.jspf" %>
	<h1>목록 페이지</h1>
	<table>
		<tr>
			<th>사번</th>
			<th>이름</th>
			<th>날짜</th>
			<th>금액</th>
			<th>조회수</th>
		</tr>
		<%
		ArrayList<Emp02Dto> list=(ArrayList<Emp02Dto>)request.getAttribute("list");
		for(Emp02Dto bean : list){		// 개선된 루프문
		%>
		<tr>
			<td><a href="select.bit?idx=<%=bean.getSabun() %>"><%=bean.getSabun() %></a></td>
			<td><a href="select.bit?idx=<%=bean.getSabun() %>"><%=bean.getName() %></a></td>
			<td><a href="select.bit?idx=<%=bean.getSabun() %>"><%=bean.getNalja() %></a></td>
			<td><a href="select.bit?idx=<%=bean.getSabun() %>"><%=bean.getPay() %></a></td>
			<td><a href="select.bit?idx=<%=bean.getSabun() %>"><%=bean.getCnt() %></a></td>
		</tr>
		<%} %>
	</table>
<%@ include file="../template/footer.jspf" %>
</body>
</html>









