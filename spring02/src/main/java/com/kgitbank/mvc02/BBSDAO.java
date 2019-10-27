package com.kgitbank.mvc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Repository;

@Repository
public class BBSDAO {
	
	public void delete2(String content) throws Exception {
		//Model(M)
			//1.드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");
			
			//View(V)
			System.out.print("1.드라이버 설정 성공!");
			
			//2.DB연결
			String url = "jdbc:mysql://localhost:3306/spring"; //연결할 db
			String user = "root"; //id
			String password = "1234"; //pw
			Connection con =DriverManager.getConnection(url,user,password);
			System.out.print("2.DB 연결 성공!!");
			
			
			//3.SQL설정
			String sql ="delete from member where id = ?";
			PreparedStatement ps =con.prepareStatement(sql);
			ps.setString(1, content);
			
			System.out.print("3.SQL결정 성공!!");
			
			
			
			//4.SQL전송
			ps.executeUpdate();
			System.out.print("4.SQL 전송 성공!!");
	}

	public void insert(String id, String title, String content, String writer) throws Exception {
	//Model(M)
		//1.드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");
		
		//View(V)
		System.out.print("1.드라이버 설정 성공!");
		
		//2.DB연결
		String url = "jdbc:mysql://localhost:3306/spring"; //연결할 db
		String user = "root"; //id
		String password = "1234"; //pw
		Connection con =DriverManager.getConnection(url,user,password);
		System.out.print("2.DB 연결 성공!!");
		
		
		//3.SQL설정
		String sql ="insert into bbs values(?,?,?,?)";
		PreparedStatement ps =con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, title);
		ps.setString(3, content);
		ps.setString(4, writer);
		
		System.out.print("3.SQL결정 성공!!");
		
		
		
		//4.SQL전송
		ps.executeUpdate();
		System.out.print("4.SQL 전송 성공!!");

	}
}
