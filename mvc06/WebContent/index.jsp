<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>업로드</h1>
	<form action="upload.do" method="post" enctype="multipart/form-data">
		<label for="file1">파일</label><input type="file" name="file1" id="file1" />
		<button type="submit">업로드</button>
	</form>
</body>
</html>