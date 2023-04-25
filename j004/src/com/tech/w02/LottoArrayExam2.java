package com.tech.w02;

import java.util.Arrays;

public class LottoArrayExam2 {
	public static void main(String[] args) {
		//lotto
		//1~45까지 랜덤 숫자 추출
		
	//	int num = (int)(Math.random()*45+1);
	//	System.out.println(num);
				
		int[] arr = new int[6];
		
		for (int i = 0; i < arr.length; i++) {
			int num = (int)(Math.random()*45+1);
			arr[i] = num;
			System.out.println("arr: "+i+">>"+arr[i]);
			for (int j = 0; j < i; j++) {
				if(arr[j]==num) {
					i = i - 1;
				}
			}
		}
		//정렬전
		System.out.println(Arrays.toString(arr));
		
		//정렬후
		//오른차순: 1234, abcd
		//내림차순: 4321, dcba
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
