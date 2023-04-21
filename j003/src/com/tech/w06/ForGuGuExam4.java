package com.tech.w06;

public class ForGuGuExam4 {
	public static void main(String[] args) {
		//2단~9단 출력
		//for문 중첩
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				//System.out.printf(j+" * "+i+" = "+j*i+"   ");
				System.out.printf("%d * %d = %2d \t", j, i, j*i);
			}
			System.out.println();
		}
	}
}
