package com.tech.w07;

public class StudentName {
	private String pass;
	
	public void Judge(String name) {
		if(name=="ȫ�浿") {
			pass = "1234";
		}else if(name=="ȫ���") {
			pass = "5678";
		}
	}

	public String getPass() {
		return pass;
	}
	
	
	
	
}
