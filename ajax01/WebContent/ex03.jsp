<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var id,pw,form,xhr;
	
	window.onload=function(){
		id=document.querySelector("#id");
		pw=document.querySelector("#pw");
		form=document.querySelector("form");
		
		form.onsubmit=function(e){
			e.preventDefault();
			xhr=new XMLHttpRequest();
			xhr.onreadystatechange=callback;
			xhr.open('GET','result03.jsp?id='+id.value+'&pw='+pw.value,true);
			xhr.send();
		};
	};
	
	function callback2(){
		
	}
	
	function callback(){
		if(xhr.readyState==4 && xhr.status==200){
			var xml=xhr.responseXML;	
			var result=xml.getElementsByTagName('result')[0].textContent;
			if(result=='true'){
				var id=xml.getElementsByTagName('id')[0].textContent;
				form.outerHTML='<div>'+id+'님 환영합니다</div>';
			}else{
				alert('로그인실패');
			}
		}
	}

</script>
</head>
<body>
	<%
		System.out.println("페이지 로딩...");
	%>
	<h1>비동기 로그인</h1>
	<form>
		<div>
			<label for="id">id</label><input type="text" id="id"/>
		</div>
		<div>
			<label for="pw">pw</label><input type="text" id="pw" />
		</div>
		<div>
			<button type="submit">로그인</button>
		</div>
	</form>
</body>
</html>










