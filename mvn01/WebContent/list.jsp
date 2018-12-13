<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList,com.bit.day15.model.Emp01Dto"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table{
		width: 600px;
		border-collapse: collapse;
	}
	table th, table td{
		border: 1px solid gray;
	}
	table tr:nth-child(2n){
		background-color: rgb(200,200,200);
	}
	table tr:HOVER{
		background-color: rgb(255,200,200);
	}
	
	td>a{
		display: block;
	}
</style>
<script type="text/javascript">
if(<%=request.getParameter("result")%>)alert(<%=request.getParameter("result")%>);

</script>
</head>
<%
	ArrayList<Emp01Dto> list=(ArrayList<Emp01Dto>)request.getAttribute("alist");
%>
<body>
	<h1>리스트 페이지</h1>
	<table>
		<tr>
			<th>사번</th>
			<th>이름</th>
			<th>날짜</th>
			<th>금액</th>
		</tr>
		<%
		for(int i=0; i<list.size();i++){ 
		Emp01Dto bean=list.get(i);
		%>
		<tr>
			<td><a href="detail.bit?idx=<%=bean.getSabun() %>"><%=bean.getSabun() %></a></td>
			<td><a href="detail.bit?idx=<%=bean.getSabun() %>"><%=bean.getName() %></a></td>
			<td><a href="detail.bit?idx=<%=bean.getSabun() %>"><%=bean.getNalja() %></a></td>
			<td><a href="detail.bit?idx=<%=bean.getSabun() %>"><%=bean.getPay() %></a></td>
		</tr>
		<%} %>
		
	</table>
	
	<a href="add.bit">[입력]</a>
</body>
</html>









