package com.kgitbank.mvc04;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReplyController {
	
	@Autowired
	ReplyDAO dao;
	
	@RequestMapping("server.do")
	public void reply(String reply, String writer, Model model) throws Exception { //view에서 reply 가 있어야하기 때문에 model필요
		//JOptionPane.showMessageDialog(null,"server.do가 호출됨.");
		model.addAttribute("reply",reply); //모델의 속성 등록
		model.addAttribute("writer",writer); //모델의 속성 등록
		dao.insert(reply,writer);
	}
	

}
