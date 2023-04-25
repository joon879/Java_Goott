package com.tech.w02;

public class MinMaxExam {
	public static void main(String[] args) {
		//배열안의 최소값 최대값 구하기
		
		int min = 101;
		int max = 0;
		int[] arr = {80, 40, 70, 20, 30};
		
		for (int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최소값: "+min);
		
		
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("최대값: "+max);
	}
}
