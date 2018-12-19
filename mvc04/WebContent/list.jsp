<%@page import="com.bit.model.Emp03Dto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#table{}
	#table>a{
		text-decoration: none;
		font-size: 1.5em;
		color: black;
	}
	#table>a>div{
		border-bottom: 1px solid gray;
		width: 400px;
		margin: 5px 0px;
	}
	#table>a>div>div{}
	#table>a>div>div:first-child{
		float: left;
		background-color: gray;
	}
	#table>a>div>div:nth-child(2){
		text-indent: 10px;
	}
</style>
</head>
<body>
<%@ include file="template/header.jspf" %>
<%@ include file="template/menu.jspf" %>
	<h1>리스트 페이지</h1>
	<div id="table">
		<%
		ArrayList<Emp03Dto> list=(ArrayList<Emp03Dto>) request.getAttribute("alist");
		for(Emp03Dto bean : list){
		%>
		<a href="detail.do?idx=<%=bean.getNum() %>">
			<div>
				<div><%=bean.getNum() %></div>
				<div><%=bean.getSub() %></div>
			</div>
		</a>
		<%} %>
	</div>
<%@ include file="template/footer.jspf" %>
</body>
</html>