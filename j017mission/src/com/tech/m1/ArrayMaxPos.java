package com.tech.m1;

import java.util.Arrays;

public class ArrayMaxPos {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int min = 101;
		int min_pos = 0;
		int max = 0;
		int max_pos = 0;

		for (int i = 0; i < arr.length; i++) {
			int num = (int)(Math.random() * 10 + 1);
			arr[i] = num;
			for (int j = 0; j < i; j++) {
				if(arr[j]==num) {
					i = i - 1;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

		// min
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				min_pos = i;
			}
		}
		System.out.println("최소값: " + min + ", 배열의 " + (min_pos + 1) + "번째 요소.");

		// max
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				max_pos = i;
			}
		}
		System.out.println("최대값: " + max + ", 배열의 " + (max_pos + 1) + "번째 요소.");

	}

}
