package com.tech.w09exception;

public class IndexOverExam {
	//예외처리
	public static void main(String[] args) {
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		try {
			System.out.println(array[99]);
		} catch (Exception e) {
			System.out.println("예외발생");
//			e.printStackTrace();
		}
	}
}
//예외상황
//사용자 입력오류: 사용자가 숫자를 잘못 입력, 문자로 입력 등
//장치 오류: 네트워크 고장, 디스크 고장 등
//코드오류: 입력코드 오류, 배열의 인덱스 번호 등