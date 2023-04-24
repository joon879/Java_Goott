package com.tech.w07;

public class DoWhileExam {
	public static void main(String[] args) {
		
		//최소 한 번은 꼭 실행하고 싶을 때 사용!
		//일단 실행하고, 조건 검사.
		int i = 11;
		int sum = 0;
		do {
			System.out.println(i);
			sum = sum + i;
			i++;
		} while (i <= 10);
		System.out.println("sum: "+sum);
	}
}
