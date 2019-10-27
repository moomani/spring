package com.kgitbank.mvc02;

public class MemberDTO {
	//글로벌 변수(자동초기화, null로 초기화)
	private String id;
	private String pw;
	private String name;
	private String tel;
	
	
	void setId(String id) {            //setId는 지역변수
		this.id = id; //변수 이름이 똑같으면 지역변수가 우선임 그래서 구별을 위해 글로벌변수 앞에 this.을 붙이는 것
	}
	
	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	

}
