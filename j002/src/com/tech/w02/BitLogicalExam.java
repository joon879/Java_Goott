package com.tech.w02;

public class BitLogicalExam {
	public static void main(String[] args) {
		System.out.println(45 & 25); // 비트연산 and: &
		System.out.println(Integer.toBinaryString(45));
		System.out.println(" " + Integer.toBinaryString(25));
		
		System.out.println(45 | 25); // 비트연산 or: |
		System.out.println(Integer.toBinaryString(45));
		System.out.println(" " + Integer.toBinaryString(25));
		
		System.out.println(45 ^ 25); // 비트연산 exclusive or(xor): ^ 서로 부호가 다를 때 1.
		System.out.println(Integer.toBinaryString(45));
		System.out.println(" " + Integer.toBinaryString(25));
	}
}
