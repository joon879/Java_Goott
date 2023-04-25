package com.tech.w02;

import java.util.Arrays;

public class TwoDemenArray4 {
	public static void main(String[] args) {
		// 2차원 배열 선언

		// 5, 4 배열 만들어서
		// 값을 1씩 증가된 값이 배열에 쌓이고
		// 그 결과를 출력하시오
		// for문 활용

		// int[][] arr = new int[5][4];
		int[][] arr = new int[5][];
		arr[0] = new int[1];
		arr[1] = new int[2];
		arr[2] = new int[8];
		arr[3] = new int[4];
		arr[4] = new int[5];
		
				
		int cnt = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = cnt++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

	}
}
