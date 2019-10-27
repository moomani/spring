package com.kgitbank.mvc02;

public class BBSDTO {
	//글로벌 변수(자동초기화, null로 초기화)
	private String id;
	private String title;
	private String content;
	private String writer;
	
	
	void setId(String id) {            //setId는 지역변수
		this.id = id; //변수 이름이 똑같으면 지역변수가 우선임 그래서 구별을 위해 글로벌변수 앞에 this.을 붙이는 것
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
