package com.tech.w01;

import java.util.Arrays;

public class AnnonyArray {
	public static void main(String[] args) {
		
		int[] aa = {1,2,3,4,5};
		System.out.println(Arrays.toString(aa));
		
		//익명(무명) 배열: 사용되는 곳이 한 차례일 때, 재사용이 없을 때 사용.
		System.out.println(Arrays.toString(new int[] {5,5,5,5,5,5}));
		
	}
}
