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
		
			$.ajax ({
				url : "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fwww.chosun.com%2Fsite%2Fdata%2Frss%2Fent.xml&api_key=rrgj7dkxxikjrh5frbnxdvgrx2oxy8p3a2fuxhhs",
				data : {
					
					url: "http://www.chosun.com/site/data/rss/ent.xml",
					api_key: "rrgj7dkxxikjrh5frbnxdvgrx2oxy8p3a2fuxhhs",
					count : 20
				},		
				
					
				success : function(result) {
					alert("�����Ϻ� ����Ʈ�� ���� ����....!!!!")
					alter(result)
					
					
				}//success
				
			}); //ajax
			
		}); //btn1
	
	
	});//start end.
</script>
</head>
<body>
<input type="button" class="btn1" value="�Ź���� �ܾ����">

	<div class="d1"></div>

</body>
</html>