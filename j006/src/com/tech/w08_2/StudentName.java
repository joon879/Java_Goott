package com.tech.w08_2;

public class StudentName {
	private String pass;
	
//	public void passSet(String name) {
//		if(name=="ȫ�浿") {
//			pass = "1234";
//		} else if(name=="ȫ���") {
//			pass = "5678";
//		}
//	}
	
	public String getPass(String name) {
		if(name=="ȫ�浿") {
			pass = "1234";
		} else if(name=="ȫ���") {
			pass = "5678";
		}
		return pass;
	}
	
	
}
