package com.tech.w02;

public class MinExam {
	public static void main(String[] args) {
		//배열안의 최소값 구하기
		int[] arr = {80, 40, 19, 20, 30};
				
		//최소값 검사
		int min = 101;//배열안의 최고 점수가 100이라 할 때
		for (int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최소값: "+min);
	}
}
