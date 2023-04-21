package com.tech.w04;

public class SwitchExam2 {

	public static void main(String[] args) {
		// 랜덤숫자가 1~6까지 범위의 숫자 추출
		char c = 'c';
		// 주사위놀이형식

		switch (c) {
		case 'B': //키값(num)의 경우의 수를 표현
			//표현식
			System.out.println("B입니다.");
			break;
		case 'A': //키값(num)의 경우의 수를 표현
			//표현식
			System.out.println("A입니다.");
			break;
	
		default: //나머지
			System.out.println("없는 문자입니다..");
			break;
		}

	}

}
