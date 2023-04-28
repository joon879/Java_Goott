package com.tech.mission;

import java.util.Scanner;

public class ArrayScoreByNameSum3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[3][2];
		int[] sumby = new int[arr.length];
		String[] names = {"학생A", "학생B", "학생C"};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("국어입력");
			arr[i][0] = scan.nextInt();
			System.out.println("영어입력");
			arr[i][1] = scan.nextInt();
			sumby[i] = arr[i][0] + arr[i][1];
		}
		
		//sumby 출력
		for (int i = 0; i < sumby.length; i++) {
//			System.out.println(i+1+"번 학생 sum: "+sumby[i]);
			System.out.println(i+1+"번("+names[i]+")학생 sum: "+sumby[i]);
		}
		
		//출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
//		String[][] name = {
//				{"    ", "국어","영어"},
//				{"학생A", "10", "20"},
//				{"학생B", "30", "40"},
//				{"학생C", "50", "60"}
//		};
//		
//		int sum = 0;
//		for (int i = 1; i < name.length; i++) {
//			for (int j = 1; j < name[i].length; j++) {
//				sum += Integer.parseInt(name[i][j]);
//			}
//			if(i==1) {
//				System.out.println(name[i][0]+" 점수 합계: "+sum);
//			}else if(i==2) {
//				System.out.println(name[i][0]+" 점수 합계: "+sum);
//			}else {
//				System.out.println(name[i][0]+" 점수 합계: "+sum);
//			}
//			sum = 0;
//		}		
	}
}
