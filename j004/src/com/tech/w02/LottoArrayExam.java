package com.tech.w02;

import java.util.Arrays;

public class LottoArrayExam {
	public static void main(String[] args) {
		//lotto
		//1~45까지 랜덤 숫자 추출
		
	//	int num = (int)(Math.random()*45+1);
	//	System.out.println(num);
				
		int[] arr = new int[6];
		
		for (int i = 0; i < arr.length; i++) {
			int num = (int)(Math.random()*45+1);
			arr[i] = num;
//			for (int j = 0; j < i; j++) {
//				if(arr[j]==num) {
//					i = i -1;
//				}
//			}
			arr[i] = num;
		}
		System.out.println(Arrays.toString(arr));
	}
}
