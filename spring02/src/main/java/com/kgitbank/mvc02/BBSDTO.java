package com.kgitbank.mvc02;

public class BBSDTO {
	//�۷ι� ����(�ڵ��ʱ�ȭ, null�� �ʱ�ȭ)
	private String id;
	private String title;
	private String content;
	private String writer;
	
	
	void setId(String id) {            //setId�� ��������
		this.id = id; //���� �̸��� �Ȱ����� ���������� �켱�� �׷��� ������ ���� �۷ι����� �տ� this.�� ���̴� ��
	}
	
	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setTel(String writer) {
		this.writer = writer ;
	}
	

}
