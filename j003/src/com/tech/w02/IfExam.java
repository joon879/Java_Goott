package com.tech.w02;

public class IfExam {
	public static void main(String[] args) {
//		if문의 형식
//		if(조건식) {
//			조건식이 참일 때 표현하고 싶은 문장.
//		} else{
//			조건식이 거짓일 때 표현하고 싶은 문장.
//		}
		
		int score = 90;
		System.out.println(score >= 90);
		// 점수가 90이상이면 pass로 조건을 달으라.
		
		if(score >= 90) {
			System.out.println("pass!!");
		} else {
			System.out.println("fail!!");
		}
	}
}
