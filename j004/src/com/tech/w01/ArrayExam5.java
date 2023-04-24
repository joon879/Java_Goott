package com.tech.w01;

public class ArrayExam5 {
	public static void main(String[] args) {
		// int[] arr = new int[5];
		// 배열선언 다른 방법
		int[] arr = { 10, 20, 30, 40, 53};
		
		//총점 매기기
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		float avg = (float)sum / arr.length; //형변환 해주어야 소숫점 살아남.
		System.out.println("총점: "+sum);
		System.out.println("평균: "+avg);
		System.out.println("인원수: "+arr.length);
	}
}
