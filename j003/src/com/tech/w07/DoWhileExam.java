package com.tech.w07;

public class DoWhileExam {
	public static void main(String[] args) {
		
		//�ּ� �� ���� �� �����ϰ� ���� �� ���!
		//�ϴ� �����ϰ�, ���� �˻�.
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
