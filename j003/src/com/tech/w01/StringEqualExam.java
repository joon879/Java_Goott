package com.tech.w01;

public class StringEqualExam {
	public static void main(String[] args) {
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		//객체 생성.
		String strVar3 = new String("홍길동");
		
		System.out.println(strVar1);
		System.out.println(strVar2);
		System.out.println(strVar3);
		
		//비교 -> 참조 비교.
		System.out.println(strVar1==strVar2);
		System.out.println(strVar2==strVar3);
		
		System.out.println();
		// equal함수 제공 -> 문자, 숫자가 같냐 비교.
		System.out.println(strVar1.equals(strVar3));
		System.out.println(strVar2.equals(strVar3));
	}
}
