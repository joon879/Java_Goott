package com.tech.mission;

import java.util.Scanner;

public class ArrayMission {
	public static void main(String[] args) {
		/*
		 10���� ��Ҹ� ������ �� �ִ� �迭 ����
		 �迭�� �����Է��� �޴´�.(50~100�� ����)
		 �հ�, ���, �ִ�����, �ּ����� ���
		 tbasic@daum.net
		 ��������: �迭_ȫ�浿
		 */
		//�迭����
		int[] arr = new int[10];
		int sum = 0;
		int avg = 0;
		int max = 49;
		int min = 101;
		//�Է¹ޱ�
		Scanner scan = new Scanner(System.in);
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
		
		System.out.println("�հ�: "+sum);
		System.out.println("���: "+(float)sum/arr.length);
		System.out.println("�ִ�����: "+max);
		System.out.println("�ּ�����: "+min);
		

	}
}
