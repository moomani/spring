<%@page import="java.sql.PreparedStatement"%>
<%@page import = "java.sql.Connection"%>
<%@page import = "java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String writer = request.getParameter("writer");
	//1.����̹� ����
	Class.forName("com.mysql.jdbc.Driver");
	out.print("1.����̹� ���� ����!");
	//2.DB����
	String url = "jdbc:mysql://localhost:3306/spring"; //������ db
	String user = "root"; //id
	String password = "1234"; //pw
	Connection con =DriverManager.getConnection(url,user,password);
	out.print("2.DB ���� ����!!");
	
	
	//3.SQL����
	String sql ="insert into bbs values(?,?,?,?)";
	PreparedStatement ps =con.prepareStatement(sql);
	ps.setString(1, id);
	ps.setString(2, title);
	ps.setString(3, content);
	ps.setString(4, writer);
	
	out.print("3.SQL���� ����!!");
	
	
	
	//4.SQL����
	ps.executeUpdate();
	out.print("4.SQL ���� ����!!");


%>

</body>
</html>