package com.tech.w02;

public class TwoDemenArray5 {
	public static void main(String[] args) {
		// 2차원 배열 선언

		// int[][] arr = new int[5][4];
		int[][] arr = {
				{1,2,3,4},
				{11,12,13,14},
				{21,22,23,24},
				{31,32,33,34},
				{41,42,43,44}
		};
		
				
		
		//출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
