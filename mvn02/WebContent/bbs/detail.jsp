<%@page import="com.bit.day16.model.Emp02Dto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="./css/frame.css" />
<style type="text/css">
	#content label{
		display: inline-block;
		width: 150px;
	}
	#content form{
		width:80%;
		margin: 0px auto;
	}
</style>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">
	$(function(){
		$('.edit').hide();
		$('form>div>a').eq(0).click(function(e){
			e.preventDefault();
			$('.edit').show();
			$('form').prev().text("수정 페이지");
			$('.detail').hide();
		}).next().click(function(e){
			e.preventDefault();
			//$.post('delete.bit',{sabun:$('#sabun').val()});
			//window.location.href='list.bit';
			$.ajax({
				async:false,
				url:'delete.bit',
				method:'POST',
				data:{sabun:$('#sabun').val()}
			});
			window.location.href='list.bit';
		}).next().click(function(e){
			e.preventDefault();
			window.history.back();
		});
		
		$('button').last().click(function(){
			
			$('.detail').show();
			$('form').prev().text("상세 페이지");
			$('.edit').hide();
		});
	});
</script>
</head>
<%
	Emp02Dto bean =(Emp02Dto) request.getAttribute("bean");
%>
<body>
<%@ include file="../template/header.jspf" %>
<%@ include file="../template/menu.jspf" %>
<h1>상세 페이지</h1>
<form method="post">
	<div>
		<label for="sabun">sabun</label><input type="hidden" name="sabun" id="sabun" value="<%=bean.getSabun() %>" />
		<span><%=bean.getSabun() %></span>
	</div>
	<div>
		<label for="name">name</label><input class="edit" type="text" name="name" id="name" value="<%=bean.getName() %>" />
		<span class="detail"><%=bean.getName() %></span>
	</div>
	<div>
		<label for="nalja">nalja</label>
		<span><%=bean.getNalja() %></span>
	</div>
	<div>
		<label for="pay">pay</label><input class="edit" type="text" name="pay" id="pay" value="<%=bean.getPay() %>" />
		<span class="detail"><%=bean.getPay() %></span>
	</div>
	<div>
		<label for="cnt">cnt</label>
		<span><%=bean.getCnt() %></span>
	</div>
	<div class="detail">
		<a href="#">수정</a>
		<a href="#">삭제</a>
		<a href="#">뒤로</a>
	</div>
	<div class="edit">
		<button type="submit">수정</button>
		<button type="reset">취소</button>
		<button type="button">뒤로</button>
	</div>
</form>
<%@ include file="../template/footer.jspf" %>
</body>
</html>









