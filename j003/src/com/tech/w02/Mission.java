package com.tech.w02;

public class Mission {
	public static void main(String[] args) {
//		면적 구하기
//		가로 100 width
//		세로 50 height
//		사각형 변수 recsquare
//		삼각형 변수 trisquare
		
		int width = 5;
		int height = 5;
		
		float recsquare = width * height;
		float trisquare = width * height / 2.0f;
		
		System.out.println("사각형 면적: "+recsquare);
		System.out.println("삼각형 면적: "+trisquare);
	}
}
