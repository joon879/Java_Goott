package com.tech.w02;

import java.util.Arrays;

public class SortExam2 {
	public static void main(String[] args) {
		//��������
		
		System.out.println("==================");
		int[] arr2 = {30,10,50,35,2};
		System.out.println("������: "+Arrays.toString(arr2));
		
		//���� �˰���
		int tmp;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length-1; j++) {
				if(arr2[i] < arr2[j]) {
					tmp = arr2[j];
					arr2[j] = arr2[i];
					arr2[i] = tmp;
				}
			}
			System.out.println((i+1)+"������: "+Arrays.toString(arr2));
		}
		System.out.println("������: "+Arrays.toString(arr2));
	}
}
