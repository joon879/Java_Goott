package com.tech.w02;

public class TwoDemenArray2 {
	public static void main(String[] args) {
		//2차원 배열 선언
		
		//5, 4 배열 만들어서
		//값을 1씩 증가된 값이 배열에 쌓이고
		//그 결과를 출력하시오
		//for문 활용
		
		int[][] arr = new int[5][4];
		int k = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = k++;
				System.out.println(arr[i][j]);
			}
		}
	}
}
