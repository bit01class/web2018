<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" style="text/css" href="css/frame.css" />
<style type="text/css">
	.bx-wrapper{
		position: relative;
	}
	.bx-prev,.bx-next{
		position: absolute;
		top: 0px;
		width:100px;
		height: 320px;
		background-color: rgba(0,0,0,0.2);
		font-size: 150px;
		font-weight: bold;
		color: white;
		text-align: center;
		text-decoration: none;
		line-height: 320px;
		opacity:0.5;
	}
	.bx-next{
		left: 860px;
	}
</style>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="js/jquery.bxslider.js"></script>
<script type="text/javascript">
	$(function(){
		$('#bx').bxSlider({
			pager:false,
			auto:true,
			slideWidth:320,
			minSlides:1,
			maxSlides:3,
			moveSlides:1,
			prevText:'<',
			nextText:'>'
		});
	});
</script>
</head>
<body>
<%@ include file="template/header.jspf" %>
<%@ include file="template/menu.jspf" %>
			<h1>환영합니다</h1>
			<div id="bx">
				<div><img alt="img" src="imgs/big1.jpg" title="img1" /></div>
				<div><img alt="img" src="imgs/big2.jpg" title="img2" /></div>
				<div><img alt="img" src="imgs/big3.jpg" title="img3" /></div>
				<div><img alt="img" src="imgs/big4.jpg" title="img4" /></div>
				<div><img alt="img" src="imgs/big5.jpg" title="img5" /></div>
				<div><img alt="img" src="imgs/big6.jpg" title="img6" /></div>
			</div>
<%@ include file="template/footer.jspf" %>
</body>
</html>









