package com.kgitbank.mvc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	//single tone의 방법을 사용한다. 주소값이 하나임.
	@Autowired
	BBSDAO dao;
	
	@RequestMapping("insert2")
	public void insert(String id, String title, String content, String writer ) throws Exception {
		System.out.println("insert2요청 됨.");
		System.out.println("입력한 id는 " + id);
		System.out.println("입력한 title은 " + title);
		System.out.println("입력한 content는 " + content);
		System.out.println("입력한 writer는 " + writer);
		dao.insert(id, title, content, writer);
	}
		@RequestMapping("delete2") 
		public void delete2(String content) throws Exception{
			
			System.out.println("delete요청 됨");
			System.out.println("삭제할content는 " + content);
			dao.delete2(content);
	}
		
		
}
	



