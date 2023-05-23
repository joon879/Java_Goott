package com.tech.w00;

interface MyFunction{
	
	int calc(int x, int y);//리턴이 있는 추상메소드.
}

public class LamdaExam {
	public static void main(String[] args) {
		
		MyFunction add = (x, y) -> {return x+y;}; //여기서 추상메소드 구현. 세미콜론 위치 주의.
		MyFunction minus = (x, y) -> {return x-y;};
		
		System.out.println(add.calc(1, 2));
		System.out.println(minus.calc(10, 5));
		
	}
}
