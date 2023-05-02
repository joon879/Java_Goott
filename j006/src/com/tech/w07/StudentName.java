package com.tech.w07;

public class StudentName {
	private String pass;
	
	public void Judge(String name) {
		if(name=="È«±æµ¿") {
			pass = "1234";
		}else if(name=="È«±æ¼ø") {
			pass = "5678";
		}
	}

	public String getPass() {
		return pass;
	}
	
	
	
	
}
