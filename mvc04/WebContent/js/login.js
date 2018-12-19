	$(function(){
		$('#header>form').submit(function(e){
			e.preventDefault();
			$.getJSON("/mvc04/login.json",$( this ).serialize(),function(data){
				//data->
				// {root:[{id:xxxx,name:xxxx}]}
				console.log(data);
				if(data.root){
					$('form').html('<p>'+data.root[0].name+'님 로그인하셨습니다</p> <a href="/mvc04/logout.do">로그아웃</a>');
				}else{
					alert("로그인 실패");
					$("#id").val("");
					$("#pw").val("");
					$("#id").focus();
				}
			});
		});
	});