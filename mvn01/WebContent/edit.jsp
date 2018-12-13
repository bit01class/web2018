<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.bit.day15.model.Emp01Dto"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	window.onload=function(){
		var backbtn=document.querySelectorAll('button')[2];
		backbtn.onclick=function(){
			window.history.back();
		};
	};
</script>
<body>
	<h1>수정 페이지</h1>
	<form action="update.bit" method="post">
	<%
		Emp01Dto bean=(Emp01Dto)request.getAttribute("bean");
	%>
		<div>
			<label for="sabun">sabun</label>
			<input type="text" name="sabun" id="sabun" value="<%=bean.getSabun() %>" readonly="readonly"/>
		</div>
		<div>
			<label for="name">name</label>
			<input type="text" name="name" id="name" value="<%=bean.getName() %>" />
		</div>
		<div>
			<label for="nalja">nalja</label>
			<input type="text" name="nalja" id="nalja" value="<%=bean.getNalja() %>" disabled="disabled"/>
		</div>
		<div>
			<label for="pay">pay</label>
			<input type="text" name="pay" id="pay" value="<%=bean.getPay() %>" />
		</div>
		<div>
			<button type="submit">수정</button>
			<button type="reset">취소</button>
			<button type="button">뒤로</button>
		</div>
	</form>
</body>
</html>