package com.tech.w02;

public class BitLogicalExam {
	public static void main(String[] args) {
		System.out.println(45 & 25); // ��Ʈ���� and: &
		System.out.println(Integer.toBinaryString(45));
		System.out.println(" " + Integer.toBinaryString(25));
		
		System.out.println(45 | 25); // ��Ʈ���� or: |
		System.out.println(Integer.toBinaryString(45));
		System.out.println(" " + Integer.toBinaryString(25));
		
		System.out.println(45 ^ 25); // ��Ʈ���� exclusive or(xor): ^ ���� ��ȣ�� �ٸ� �� 1.
		System.out.println(Integer.toBinaryString(45));
		System.out.println(" " + Integer.toBinaryString(25));
	}
}
