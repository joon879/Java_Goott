package com.tech.w01;

import java.util.Arrays;

public class AnnonyArray2 {
	public static void main(String[] args) {
		
		//�͸�(����) �迭: ���Ǵ� ���� �� ������ ��, ������ ���� �� ���.
		
		
		System.out.println("sum: "+sum(new int[] {5,5,5,5,5}));
		
	}
	private static int sum(int[] arrs) {
		int total = 0;
		for (int i = 0; i < arrs.length; i++) {
			total += arrs[i];
		}
		return total;
	}
}
