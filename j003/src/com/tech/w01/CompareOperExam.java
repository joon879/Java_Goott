package com.tech.w01;

public class CompareOperExam {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1==num2); // 같으냐?
		boolean result2 = (num1!=num2); // 다르냐?
		boolean result3 = (num1<=num2); // num1이 num2보다 작거나 같냐?
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = char1 < char2;
		System.out.println(result4);
		
//		byte 1
//		char 2
//		short 2
//		int 4
//		long 8
//		float 4
//		double 8
//		boolean 1	

	}

}
