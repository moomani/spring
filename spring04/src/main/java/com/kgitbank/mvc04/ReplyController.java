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
	public void reply(String reply, String writer, Model model) throws Exception { //view���� reply �� �־���ϱ� ������ model�ʿ�
		//JOptionPane.showMessageDialog(null,"server.do�� ȣ���.");
		model.addAttribute("reply",reply); //���� �Ӽ� ���
		model.addAttribute("writer",writer); //���� �Ӽ� ���
		dao.insert(reply,writer);
	}
	

}
