package com.tech.w02;

public class IfElseExam3 {
	public static void main(String[] args) {
		// if���� Ȱ���� ������ �б�.
		int score = 80;
		String grade = ""; // �ʱ�ȭ.
		
		
		if(score >= 90) {
			grade = "90���� ����";
		} else if(score >= 80){
			grade = "80���� ����";
		} else if(score >= 70) {
			grade = "70���� ����";
		} else if(score >= 60) {
			grade = "60���� ����";
		} else {
			grade = "������";
		}
		System.out.println(grade);
	}
}
