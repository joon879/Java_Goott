package com.tech.w06;

public class ForExam2 {
	public static void main(String[] args) {
//		for문 반복문
		
		//반복문을 사용한 합계 구하기 1~10
		int sum = 0; // 누적변수
		for (int i = 0; i <= 10; i++) {
			//누적
			sum = sum + i;
			System.out.println(i+"반복");
		}
		//최종 출력
		System.out.println("total: "+sum);
	}
}
