package com.tech.mission3;

public class MatrixSum {
//	int horizon_sum;
//	int vertical_sum;
	
	public void matPrintSum() {
		int[][] arr = new int[5][5];
		
		//데이터를 배열에 저장
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (row!=4 && col!=4) {
					arr[row][col] = (int)(Math.random()*10+1);
					arr[row][4] += arr[row][col];
					arr[4][col] += arr[row][col];
					arr[4][4] += arr[row][col];
				}
			}
		}
		
		//데이터 배열에 계산
//		for (int row = 0; row < arr.length; row++) {
//			for (int col = 0; col < arr[row].length; col++) {
//				if (row!=4 && col!=4) {
//					arr[row][4] += arr[row][col];
//					arr[4][col] += arr[row][col];
//					arr[4][4] += arr[row][col];
//				}
//			}
//		}
		
		
		
		//데이터를 출력
				for (int row = 0; row < arr.length; row++) {
					for (int col = 0; col < arr[row].length; col++) {
						System.out.printf("%5d", arr[row][col]);
					}
					System.out.println();
				}
		
	}
}
