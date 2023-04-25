package com.tech.w03;

import java.util.Scanner;

public class ArrayNameHeightExam4 {
	public static void main(String[] args) {
		//배열1 names에 이름 5인을 미리 입력하고
		//배열2 heights 각각 이름의 키를 입력받아
		//배열1의 이름에 해당하는 키를 출력하시오
		//신장 토탈, 평균신장 출력
		
				
		String[] names = {"tom1", "tom2", "tom3", "tom4", "tom5"};
		int[] heights = new int[names.length];
		
		Scanner scan = new Scanner(System.in);
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
