package com.tech.w08;

public class StudentName {
	private String pass;
	
	public void passSet(String name) {
		if(name=="È«±æµ¿") {
			pass = "1234";
		} else if(name=="È«±æ¼ø") {
			pass = "5678";
		}
	}
	
	public String getPass() {
		return pass;
	}
	
	
}
