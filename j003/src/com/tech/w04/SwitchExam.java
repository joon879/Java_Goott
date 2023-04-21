package com.tech.w04;

public class SwitchExam {

	public static void main(String[] args) {
		// 랜덤숫자가 1~6까지 범위의 숫자 추출
		
		int num = (int)(Math.random()*6) + 1;
		System.out.println(num);
		
		switch (num) {
		case 1: //키값(num)의 경우의 수를 표현
			//표현식
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		case 4:
			System.out.println("4입니다.");
			break;
		case 5:
			System.out.println("5입니다.");
			break;
		case 6:
			System.out.println("6입니다.");
			break;
		default: //나머지
			System.out.println("나머지.");
			break;
		}

	}

}
