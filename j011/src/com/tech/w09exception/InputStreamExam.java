package com.tech.w09exception;

import java.io.IOException;

public class InputStreamExam {
	
	public static void main(String[] args) throws IOException {
		System.out.println("String 입력");
		int r = 0;
		while ((r = System.in.read()) != -1) { //입력값 없는게 -1이다. 입력값 없을 때까지 루프 돈다.
			System.out.print("입력값 = ");
			if(r != 10 && r != 13) {//엔터
				System.out.write(r); // 문자단위로 읽어오기.
			}
			System.out.println("의 아스키 코드값: "+r);
		}
		System.out.println("Enddddddd");
	}
}
