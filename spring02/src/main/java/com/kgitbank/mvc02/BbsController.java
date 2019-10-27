package com.kgitbank.mvc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	//single tone�� ����� ����Ѵ�. �ּҰ��� �ϳ���.
	@Autowired
	BBSDAO dao;
	
	@RequestMapping("insert2")
	public void insert(String id, String title, String content, String writer ) throws Exception {
		System.out.println("insert2��û ��.");
		System.out.println("�Է��� id�� " + id);
		System.out.println("�Է��� title�� " + title);
		System.out.println("�Է��� content�� " + content);
		System.out.println("�Է��� writer�� " + writer);
		dao.insert(id, title, content, writer);
	}
		@RequestMapping("delete2") 
		public void delete2(String content) throws Exception{
			
			System.out.println("delete��û ��");
			System.out.println("������content�� " + content);
			dao.delete2(content);
	}
		
		
}
	



