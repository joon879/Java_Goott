package com.tech.w03;

public class IfNestedExam {
	public static void main(String[] args) {
		// ��ø if��
		
		int score = (int) (Math.random() * 50) + 50;
		System.out.println(score);
		// ���� �ű�� A+ A B+ B ...
		
		String grade = "";
		if(score > 90) {
			if(score > 95) {
				grade = "A+";
			}else {
				grade = "A";
			}
		}
		else if(score >= 80) {
			if(score > 85) {
				grade = "B+";
			}else {
				grade = "B";
			}
		}
		else if(score > 70) {
			if(score > 75) {
				grade = "C+";
			}else {
				grade = "C";
			}
		}
		else if(score > 60) {
			if(score > 55) {
				grade = "D+";
			}else {
				grade = "D";
			}
		}
		else {
			grade = "F";
		}
		System.out.println("����� �����: "+grade);
	}
}
