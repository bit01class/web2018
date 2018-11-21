<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="bean" class="com.bit.day45.bbs.JavaBean" scope="request"></jsp:useBean>
	<h1>수정 페이지</h1>
	<form action="update.jsp" method="post">
		<table width="1024">
			<tr>
				<td>글번호</td>
				<td><input type="text" name="num" value='<jsp:getProperty property="num" name="bean"/>'> </td>
				<td>이름</td>
				<td><jsp:getProperty property="name" name="bean"/></td>
				<td>날짜</td>
				<td><jsp:getProperty property="nalja" name="bean"/> </td>
			</tr>
			<tr>
				<td>제목</td>
				<td colspan="5"><input type="text" name="sub" value='<jsp:getProperty property="sub" name="bean"/>'> </td>
			</tr>
			<tr>
				<td>내용</td>
				<td colspan="5"><textarea rows="5" cols="60" name="content"><jsp:getProperty property="content" name="bean"/></textarea> </td>
			</tr>
			<tr>
				<td colspan="6"></td>
			</tr>
		</table>
	</form>
</body>
</html>













