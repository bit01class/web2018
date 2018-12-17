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
			<h1>입력 페이지</h1>
			<form method="post">
				<div>
					<label for="sub">제목</label><input type="text" name="sub" id="sub" />
				</div>
				<div>
					<textarea rows="6" cols="60" name="content"></textarea>
				</div>
				<div>
					<button type="submit">입력</button>
					<button type="reset">취소</button>
				</div>
			</form>
		</div>
		<div id="footer">
			<address>비트캠프 서울시 서초구 서초동 1327-15 비트아카데미빌딩</address>
			Copyright &copy; 비트캠프 All rights reserved.
		</div>
	</div>
</body>
</html>
























