package com.tech.mission;

import java.util.Scanner;

public class ArrayScoreByNameSum3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[3][2];
		int[] sumby = new int[arr.length];
		String[] names = {"�л�A", "�л�B", "�л�C"};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("�����Է�");
			arr[i][0] = scan.nextInt();
			System.out.println("�����Է�");
			arr[i][1] = scan.nextInt();
			sumby[i] = arr[i][0] + arr[i][1];
		}
		
		//sumby ���
		for (int i = 0; i < sumby.length; i++) {
//			System.out.println(i+1+"�� �л� sum: "+sumby[i]);
			System.out.println(i+1+"��("+names[i]+")�л� sum: "+sumby[i]);
		}
		
		//���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
//		String[][] name = {
//				{"    ", "����","����"},
//				{"�л�A", "10", "20"},
//				{"�л�B", "30", "40"},
//				{"�л�C", "50", "60"}
//		};
//		
//		int sum = 0;
//		for (int i = 1; i < name.length; i++) {
//			for (int j = 1; j < name[i].length; j++) {
//				sum += Integer.parseInt(name[i][j]);
//			}
//			if(i==1) {
//				System.out.println(name[i][0]+" ���� �հ�: "+sum);
//			}else if(i==2) {
//				System.out.println(name[i][0]+" ���� �հ�: "+sum);
//			}else {
//				System.out.println(name[i][0]+" ���� �հ�: "+sum);
//			}
//			sum = 0;
//		}		
	}
}
