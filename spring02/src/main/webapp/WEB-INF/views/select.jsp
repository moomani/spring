<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
���̵�� �˻��� ����Դϴ�.
<br>
<hr color = "blue">

<%-- 
<%= %>ǥ����(Expression) :�������
--> ${}ǥ�����(Expression Language : EL) : �Ӽ����
--%>
�˻��� id : ${dto2.id}<br> <!--  dto.getId() -->
�˻��� pw : ${dto2.pw}<br> <!--  dto.getId() -->
�˻��� name : ${dto2.name}<br> <!--  dto.getId() -->
�˻��� tel : ${dto2.tel}<br> <!--  dto.getId() -->
<img src = "resources/img/car.jpg">
</body>
</html>