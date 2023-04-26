package com.tech.w01;

import java.util.Arrays;

public class AnnonyArray2 {
	public static void main(String[] args) {
		
		//익명(무명) 배열: 사용되는 곳이 한 차례일 때, 재사용이 없을 때 사용.
		
		
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
