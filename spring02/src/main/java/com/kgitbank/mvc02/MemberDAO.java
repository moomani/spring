package com.kgitbank.mvc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	//자동 import Ctrl + Alt + o (영문)
	
	public MemberDTO select(String id) throws Exception {
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
			String sql ="select * from member where id = ?";
			PreparedStatement ps =con.prepareStatement(sql);
			ps.setString(1, id);
			System.out.print("3.SQL결정 성공!!");
			
			
			
			//4.SQL전송
			ResultSet rs = ps.executeQuery();//read(select!) -반환되는 값이 있어야 하기 때문에 
			MemberDTO dto2 = null; //if 안에서 선언하면 안된다  선언은 하나의 변수안에 하나만 해야한다
			if(rs.next()) {//검색 결과가 있는지 체크 :true
				String gid = rs.getString(1); //id 컬럼 번호는 1
				String pw = rs.getString(2); //pw는 2
				String name = rs.getString(3); //name은 3
				String tel = rs.getString(4); //tel 4
				System.out.println(gid);
				System.out.println(pw);
				System.out.println(name);
				System.out.println(tel);
			    dto2 = new MemberDTO();
				dto2.setId(gid);
				dto2.setPw(pw);
				dto2.setName(name);
				dto2.setTel(tel);
			}
			System.out.print("4.SQL 전송 성공!!");
			return dto2;
	}

	
	public void delete(String id) throws Exception {
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
			ps.setString(1, id);
			
			System.out.print("3.SQL결정 성공!!");
			
			
			
			//4.SQL전송
			ps.executeUpdate();
			System.out.print("4.SQL 전송 성공!!");
	}


	public void insert(String id, String pw, String name, String tel) throws Exception {
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
		String sql ="insert into member values(?,?,?,?)";
		PreparedStatement ps =con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		
		System.out.print("3.SQL결정 성공!!");
		
		
		
		//4.SQL전송
		ps.executeUpdate();
		System.out.print("4.SQL 전송 성공!!");

	}
}
