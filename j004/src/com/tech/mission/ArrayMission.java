package com.tech.mission;

import java.util.Scanner;

public class ArrayMission {
	public static void main(String[] args) {
		/*
		 10개의 요소를 저장할 수 있는 배열 선언
		 배열에 성적입력을 받는다.(50~100점 사이)
		 합계, 평균, 최대점수, 최소점수 출력
		 tbasic@daum.net
		 메일제목: 배열_홍길동
		 */
		//배열선언
		int[] arr = new int[10];
		int sum = 0;
		int avg = 0;
		int max = 49;
		int min = 101;
		//입력받기
		Scanner scan = new Scanner(System.in);
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
		
		System.out.println("합계: "+sum);
		System.out.println("평균: "+(float)sum/arr.length);
		System.out.println("최대점수: "+max);
		System.out.println("최소점수: "+min);
		

	}
}
