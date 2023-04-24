package com.tech.w01;

import java.util.Scanner;

public class ArrayExam2 {

	public static void main(String[] args) {

// 		배열선언
		int[] arr = new int[5];
		//Index number는 0부터 시작.

		//초기화 없이 출력	
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
//		System.out.println(scores[5]); -> Index 5 out of bounds.
		
		//데이터 대입.
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		
		//반복문을 활용한 출력.
		for (int i = 0;  i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("배열의 길이:"+arr.length);
		
		//Scanner를 활용한 데이터 입력.
		Scanner scan = new Scanner(System.in);
		System.out.println("1번째 입력하세요.");
		arr[0] = scan.nextInt();
		System.out.println("2번째 입력하세요.");
		arr[1] = scan.nextInt();
		System.out.println("3번째 입력하세요.");
		arr[2] = scan.nextInt();
		System.out.println("4번째 입력하세요.");
		arr[3] = scan.nextInt();
		System.out.println("5번째 입력하세요.");
		arr[4] = scan.nextInt();
		
		scan.close();
		for(int i = 0; i < arr.length; i++) {
			System.out.println("당신이 입력한 "+(i+1)+"번째 숫자는: "+arr[i]);
		}
	}
}
