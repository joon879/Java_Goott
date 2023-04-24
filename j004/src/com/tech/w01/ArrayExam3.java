package com.tech.w01;

import java.util.Scanner;

public class ArrayExam3 {

	public static void main(String[] args) {

		int[] arr = new int[5];
		// Scanner를 활용한 데이터 입력.
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요.");
			arr[i] = scan.nextInt();
		}

//		System.out.println("1번째 입력하세요.");
//		arr[0] = scan.nextInt();
//		System.out.println("2번째 입력하세요.");
//		arr[1] = scan.nextInt();
//		System.out.println("3번째 입력하세요.");
//		arr[2] = scan.nextInt();
//		System.out.println("4번째 입력하세요.");
//		arr[3] = scan.nextInt();
//		System.out.println("5번째 입력하세요.");
//		arr[4] = scan.nextInt();

		scan.close();
		
		//반복문을 활용한 출력.
		for (int i = 0; i < arr.length; i++) {
			System.out.println("당신이 입력한 " + (i + 1) + "번째 숫자는: " + arr[i]);
		}
	}
}
