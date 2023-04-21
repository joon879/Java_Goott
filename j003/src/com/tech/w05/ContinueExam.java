package com.tech.w05;

public class ContinueExam {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(i==5) {
				continue; //이하의 반복문을 탈출하고 반복문 증감식으로 다시 올라간다. break와 다름.
			}
			System.out.println("현재 i: "+i);
		}
	}
}
