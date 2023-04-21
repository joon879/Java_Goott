package com.tech.w01;

public class StringConcatExam {
	public static void main(String[] args) {
		String str1 = "JKD" + 6.0;
		// 6.0은 float나 double중 하나인데 f 안 썼으니 double임
		// double의 d는 끝에 생략해도 됨.
		// float는 f 생략 불가.
		
		String str2 = str1 + "특징";
		System.out.println(str2);
		System.out.println();
		
		String str3 = "jdk"+3+3+3+3.0; // 시작이 스트링이라 단순하게 이어서. 전체 스트링으로!
		String str4 = 3+3+3.0+"jdk"; // 시작이 숫자라 숫자끼리 더하다가 문자열은 이어서.
		System.out.println(str3);
		System.out.println(str4);
		
		String str5 = str1.concat(str4); // 두 문자열 결함.
		System.out.println(str5);
	}
}
