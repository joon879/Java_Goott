package com.tech.mission;

import java.util.Scanner;

public class ArrayMission3 {
	public static void main(String[] args) {
		
		//�迭����
		int[] arr = new int[5];
		int sum = 0;
		float avg = 0;
		int max = 49;
		int min = 101;
		//�Է¹ޱ�
		Scanner scan = new Scanner(System.in);
		
		//�Է�
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+"�� �л��� ������ �Է����ּ���.");
			arr[i] = scan.nextInt();
			if(arr[i]<50 || arr[i]>100) {
				System.out.println("50~100�� ���̸� �Է����ֽʽÿ�.");
				i = i - 1;
				continue;
			}else {
				sum = sum + arr[i];
			}
		}
		//max
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		//min
		for (int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		avg = (float)sum/arr.length;

		System.out.printf("sum: %d avg: %.1f", sum, avg);
		System.out.printf("\nmax: %d %d\n", max, min);
		
//		System.out.println("�հ�: "+sum);
//		System.out.println("���: "+avg);
//		System.out.println("�ִ�����: "+max);
//		System.out.println("�ּ�����: "+min);
	

	}
}
