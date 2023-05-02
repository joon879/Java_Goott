package com.tech.mission2;

public class MatrixSum {
//	int horizon_sum;
//	int vertical_sum;
	
	
	public int matPrintSum() {
		int[][] mat = new int[5][5];
		
		//배열에 랜덤 입력
		for (int i = 0; i < mat.length-1; i++) {
			for (int j = 0; j < mat[i].length-1; j++) {
				mat[i][j] = (int)(Math.random()*10);
//				System.out.print(mat[i][j]+"\t");
			}
//			System.out.println();
		}
		
		//가로합
		for (int i = 0; i < mat.length-1; i++) {
			for (int j = 0; j < mat.length-1; j++) {
//				mat[0][4] += mat[0][i];
				mat[i][mat.length-1] += mat[i][j];	
			}
		}
		
		//세로합+(5,5)추가
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[mat.length-1][i] += mat[j][i];
			}
		}
		
		//출력
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
		
//		System.out.println(mat[mat.length-1]);
//		mat.length-1 -> 4
		
//		System.out.println(mat[0][4]);
//		System.out.println(mat[1][4]);
//		System.out.println(mat[2][4]);
//		System.out.println(mat[3][4]);
//		
//		System.out.println(mat[4][0]);
//		System.out.println(mat[4][1]);
//		System.out.println(mat[4][2]);
//		System.out.println(mat[4][3]);
		
		
		
		return 0;
	}
}
