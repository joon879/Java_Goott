package com.tech.w02;

public class Mission2 {
	public static void main(String[] args) {
//		면적 구하기
//		가로 100 width
//		세로 50 height
//		사각형 변수 recsquare
//		삼각형 변수 trisquare
//		타입 변수 stype = 4, 3 -> 4이면 사각형, 3이면 삼각형		
		
		int width = 5;
		int height = 5;
		int stype = 3;
		
		float recsquare = width * height;
		float trisquare = width * height / 2.0f;
		
		if(stype == 4) {
			System.out.println("사각형 면적: "+recsquare);
		} else if(stype == 3) {
			System.out.println("삼각형 면적: "+trisquare);
		}
		
	}
}
