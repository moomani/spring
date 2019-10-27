<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">

	$(function () { //body먼저 인식하고, 자바스크립트해주세요.
		$('.btn1').click(function () {
			//버튼을 클릭 하면, 입력한 값을 가지고 온다.
			reValue = $('.reply').val()
			wrValue = $('.writer').val()
			$.ajax ({
				url : "server.do",
				data : {
					
					reply : reValue,
					writer : wrValue 
					//값을 넘길게 하나 더있으면 쉼표
				
				},//맵핑
				success : function(result) {
					alert("서버로 통신 성공...!!!")
					$('.d1').append('<img src=resources/img/고양이.jpg width=50 higth=50>')
					$('.d1').append(result)
				}//success
				
			}); //ajax
			
		}); //btn1
	
	
	});//start end.
</script>
</head>
<body>
<input type="text" class="reply" name="reply">
<input type="text" class="writer" name="writer">
<input type="button" class="btn1" value="댓글달기">

	<div class="d1"></div>

</body>
</html>