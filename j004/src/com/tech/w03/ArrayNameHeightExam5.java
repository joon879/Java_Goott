package com.tech.w03;

import java.util.Scanner;

public class ArrayNameHeightExam5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("인원수를 입력: ");
		int cntPerson = scan.nextInt();
//		System.out.println(cntPerson);
		String[] names = new String[cntPerson];
		
		int[] heights = new int[names.length];
		
		
		int total = 0;
		
		for (int i = 0; i < heights.length; i++) {
			System.out.println("이름을 입력하시오.");
			names[i] = scan.next();
			System.out.println("키를 입력하시오.");
			heights[i] = scan.nextInt();
			total += heights[i];			
		}
		
		for (int i = 0; i < heights.length; i++) {
			System.out.println(names[i]+"의 키는: "+heights[i]);
		}
		System.out.println("키의 합계: "+total);
		System.out.println("키의 평균: "+total/(float)heights.length);
		
	}
}
