package com.tech.w06;

public class ForExam {
	public static void main(String[] args) {
//		for문 반복문
//		for(초기값;조건식;증감식) {
//			문장
//		}
//		실행순서: 초기값 -> 조건식 -> 문장 -> 증감식 -> [조건식 -> 문장 -> 증감식]반복.
//		//증가 for문
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i+"반복");
//		}
		
		//2씩 증가 for문
		for (int i = 0; i < 10; i=i+2) {
			System.out.println(i+"반복");
		}
		
		//감소 for문
		for (int i = 10; i > 0; i--) {
			System.out.println(i+"반복");
		}
	}
}
