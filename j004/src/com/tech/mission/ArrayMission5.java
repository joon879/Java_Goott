package com.tech.mission;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayMission5 {
	public static void main(String[] args) {
		
		//배열선언
		Integer[] arr = new Integer[5];
		int sum = 0;
		float avg = 0;
		int max = 49;
		int min = 101;
		//입력받기
		Scanner scan = new Scanner(System.in);
		
		//입력
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+"번 학생의 성적을 입력해주세요.");
			arr[i] = scan.nextInt();
			if(arr[i]<50 || arr[i]>100) {
				System.out.println("50~100점 사이를 입력해주십시오.");
				i = i - 1;
				continue;
			}else {
				sum = sum + arr[i];
			}
		}
//		//max
//		for (int i = 0; i < arr.length; i++) {
//			if(max < arr[i]) {
//				max = arr[i];
//			}
//		}
//		//min
//		for (int i = 0; i < arr.length; i++) {
//			if(min > arr[i]) {
//				min = arr[i];
//			}
//		}
		
		//삼항연산자로
		for (int i = 0; i < arr.length; i++) {
			max = arr[i]>max? arr[i]:max;
			min = arr[i]<min? arr[i]:min;
		}
		
		avg = (float)sum/arr.length;

		System.out.printf("sum: %d avg: %.1f", sum, avg);
		System.out.printf("\nmax: %d %d\n", max, min);
		
//		System.out.println("합계: "+sum);
//		System.out.println("평균: "+avg);
//		System.out.println("최대점수: "+max);
//		System.out.println("최소점수: "+min);
		
		System.out.println(Arrays.toString(arr));
		
		//sort
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//역정렬
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));

	}
}
