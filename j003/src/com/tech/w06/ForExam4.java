package com.tech.w06;

public class ForExam4 {
	public static void main(String[] args) {
//		for문 반복문

		// 반복문을 사용한 합계 구하기
		// 짝수의 합계 even
		// 홀수의 합계 odd

		int even = 0, odd = 0; // 누적변수
		for (int i = 1; i <= 10000; i++) {
			if (i % 2 == 0) {
				even += i;
			} else {
				odd += i;
			}
		}

		// 최종 출력
		System.out.println("짝수의 합계: " + even);
		System.out.println("홀수의 합계: " + odd);

		even = 0;
		odd = 0; // 누적변수
		for (int i = 0; i <= 10000; i = i + 2) {
			even += i;
		}
		for (int i = 1; i <= 10000; i = i + 2) {
			odd += i;
		}

		// 최종 출력
		System.out.println("짝수의 합계: " + even);
		System.out.println("홀수의 합계: " + odd);
	}
}
