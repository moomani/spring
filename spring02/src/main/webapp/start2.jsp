<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action ="insert2">
        아이디<input type ="text" name="id"><br>
        제목<input type ="text" name="title"><br>
        내용<input type ="text" name="content"><br>
        작성자<input type ="text" name="writer"><br>
    <input type ="submit" value="서버로 전송">
</form>
<hr color ="red">
<form action ="delete2">
        내용<input type ="text" name="content"><br>
    <input type ="submit" value="content 삭제">
</form>

</body>
</html>