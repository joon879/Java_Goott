package com.tech.w01;

import java.util.Scanner;

public class ArrayExam3 {

	public static void main(String[] args) {

		int[] arr = new int[5];
		// Scanner�� Ȱ���� ������ �Է�.
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+"��° ���ڸ� �Է��ϼ���.");
			arr[i] = scan.nextInt();
		}

//		System.out.println("1��° �Է��ϼ���.");
//		arr[0] = scan.nextInt();
//		System.out.println("2��° �Է��ϼ���.");
//		arr[1] = scan.nextInt();
//		System.out.println("3��° �Է��ϼ���.");
//		arr[2] = scan.nextInt();
//		System.out.println("4��° �Է��ϼ���.");
//		arr[3] = scan.nextInt();
//		System.out.println("5��° �Է��ϼ���.");
//		arr[4] = scan.nextInt();

		scan.close();
		
		//�ݺ����� Ȱ���� ���.
		for (int i = 0; i < arr.length; i++) {
			System.out.println("����� �Է��� " + (i + 1) + "��° ���ڴ�: " + arr[i]);
		}
	}
}
