package com.tech.w09;

public class KoreanTest {
	public static void main(String[] args) {
		Korean k1 = new Korean("박자바", "123456-123456");
		
		//전달한 내용을 출력(private이라 바로 접근 불가)
//		System.out.println(k1.name);
//		System.out.println(k1.ssn);
		
		//메소드를 통한 접근
		System.out.println(k1.getName());
		System.out.println(k1.getSsn());
	}
}
