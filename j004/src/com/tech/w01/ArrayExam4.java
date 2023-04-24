package com.tech.w01;

public class ArrayExam4 {
	public static void main(String[] args) {
		// int[] arr = new int[5];
		// 배열선언 다른 방법
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println("길이: " + arr.length);

		// 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// 한 줄로 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println("\n===================");
		// 한 줄로 출력 + 마지막 ,제거
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length-1) {
				System.out.print(arr[i]+", ");
			}else {
				System.out.print(arr[i]);
			}
		}
		
System.out.println("\n===================");
		// 한 줄로 출력 + 마지막 ,제거
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length-1) {
				System.out.print(arr[i]+", ");
			}else {
				System.out.print(arr[i]);
			}
		}
	}
}
