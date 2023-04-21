package com.tech.w06;

public class ForGuGuExam3 {
	public static void main(String[] args) {
		//2단~9단 출력
		//for문 중첩
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d \t*\t %d \t = \t %2d \n", i, j, i*j);
			}
			System.out.println("===================================");			
		}
	}
}
