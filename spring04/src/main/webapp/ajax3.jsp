<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">

	$(function () { //body���� �ν��ϰ�, �ڹٽ�ũ��Ʈ���ּ���.
		$('.btn1').click(function () {
			//��ư�� Ŭ�� �ϸ�, �Է��� ���� ������ �´�.
			reValue = $('.reply').val()
			wrValue = $('.writer').val()
			$.ajax ({
				url : "server.do",
				data : {
					
					reply : reValue,
					writer : wrValue 
					//���� �ѱ�� �ϳ� �������� ��ǥ
				
				},//����
				success : function(result) {
					alert("������ ��� ����...!!!")
					$('.d1').append('<img src=resources/img/�����.jpg width=50 higth=50>')
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
<input type="button" class="btn1" value="��۴ޱ�">

	<div class="d1"></div>

</body>
</html>