package com.tech.w03;

public class IfMission {
	public static void main(String[] args) {
		//랜덤정수를 입력받고(100~200)
		//랜덤정수가 짝인지 홀수인지 판정하세요.
		//추가로 3의 배수, 5의 배수 판정.
		//캡쳐 메일전송. 소스, 결과 포함
		//tbasic@daum.net
		//제목: 이승준_랜덤if
		
		int score = (int)((Math.random() * 100) + 100);
		System.out.println(score);
		
		String hol = "";
		String sam ="";
		String oh ="";
		
		if(score % 2 == 0) {
			hol = "짝수입니다.";
		} else {
			hol = "홀수입니다.";
		}
		System.out.println(hol);
		
		if(score % 3 == 0) {
			sam = "3의 배수입니다.";
		} else {
			sam = "3의 배수가 아닙니다.";
		}
		System.out.println(sam);
		
		if(score % 5 == 0) {
			oh = "5의 배수입니다.";
		} else {
			oh = "5의 배수가 아닙니다.";
		}
		System.out.println(oh);
		
		if(score % 2 == 0 && score % 3 == 0 && score % 5 == 0) {
			oh = "2, 3, 5의 배수입니다.";
		} else {
			oh = "2, 3, 5의 배수가 아닙니다.";
		}
		System.out.println(oh);
		
	}
}
