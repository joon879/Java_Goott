package com.tech.w02;

public class Mission3 {
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
		
//		float recsquare = width * height;
//		float trisquare = width * height / 2.0f;
		
		float resultsquare = 0;
		
		if(stype == 4) {
			resultsquare = width * height;
		} else if(stype == 3) {
			resultsquare = width * height / 2.0f;
		}
		System.out.println(resultsquare);
	}
}
