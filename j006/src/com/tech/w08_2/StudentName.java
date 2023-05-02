package com.tech.w08_2;

public class StudentName {
	private String pass;
	
//	public void passSet(String name) {
//		if(name=="È«±æµ¿") {
//			pass = "1234";
//		} else if(name=="È«±æ¼ø") {
//			pass = "5678";
//		}
//	}
	
	public String getPass(String name) {
		if(name=="È«±æµ¿") {
			pass = "1234";
		} else if(name=="È«±æ¼ø") {
			pass = "5678";
		}
		return pass;
	}
	
	
}
