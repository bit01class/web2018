<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#content>div{}
	#content>div>div{}
	#content>div>div:last-child{
		height: 100px;
	}
	#content>div>div>span{
		display: inline-block;
	}
	#content>div>div>span:nth-child(2n-1){
		background-color: gray;
		width: 80px;
	}    
</style>
<script type="text/javascript" src="../js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="../js/login.js"></script>
</head>
<body>
<%@ include file="template/header.jspf" %>
<%@ include file="template/menu.jspf" %>
	<jsp:useBean id="bean" class="com.bit.model.Emp03Dto" scope="request"></jsp:useBean>
	<h1>상세 페이지</h1>
	<div>
		<div>
			<span>글번호</span>
			<span><jsp:getProperty property="num" name="bean"/></span>
			<span>글쓴이</span>
			<span><jsp:getProperty property="unum" name="bean"/></span>
			<span>조회수</span>
			<span><jsp:getProperty property="cnt" name="bean"/></span>
		</div>
		<div>
			<span>제목</span>
			<span><jsp:getProperty property="sub" name="bean"/></span>
		</div>
		<div><jsp:getProperty property="content" name="bean"/></div>	
	</div>
<%@ include file="template/footer.jspf" %>
</body>
</html>




