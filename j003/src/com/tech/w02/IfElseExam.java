package com.tech.w02;

public class IfElseExam {
	public static void main(String[] args) {
		// if���� Ȱ���� ������ �б�.
		int score = 50;
		
		
		if(score >= 90) {
			System.out.println("90���� ����");
		} else if(score >= 80){
			System.out.println("80���� ����");
		} else if(score >= 70) {
			System.out.println("70���� ����");
		} else if(score >= 60) {
			System.out.println("60���� ����");
		} else {
			System.out.println("60���̸� ����");
		}
	}
}
