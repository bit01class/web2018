<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/frame.css" />
</head>
<body>
	<div>
		<div id="header">
			<h1>비트교육센터</h1>
		</div>
		<div id="menu">
			<a href="index.do">HOME</a>
			<a href="intro.do">INTRO</a>
			<a href="list.do">BBS</a>
			<%
			if(session.getAttribute("result")==null){
			%>
			<a href="login.do">LOGIN</a>
			<%
			}else if(!(Boolean)session.getAttribute("result")){
			%>
			<a href="login.do">LOGIN</a>
			<%
			}else{
			%>
			<a href="logout.do">LOGOUT</a>
			<%
			}
			%>
		</div>
		<div id="content">
			<h1>로그아웃</h1>
			<p>이용해 주셔서 감사합니다</p>
		</div>
		<div id="footer">
			<address>비트캠프 서울시 서초구 서초동 1327-15 비트아카데미빌딩</address>
			Copyright &copy; 비트캠프 All rights reserved.
		</div>
	</div>
</body>
</html>
























