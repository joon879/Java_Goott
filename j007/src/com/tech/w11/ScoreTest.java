package com.tech.w11;

public class ScoreTest {
	public static void main(String[] args) {
//		점수 국어 영어 수학
//		누구의 총점 300
//		누구의 평균 100
//		계산은 Score에서 리턴
//		생성자를 통해서 점수전달
		
//		홍길동의 총점 getTotal: 240
//		홍길동의 평균 getAvg: 80
		Score sc = new Score("홍길동", 50, 50, 100);
		
		System.out.println(sc.getName()+"의 총점: "+sc.getTotal());
		System.out.println(sc.getName()+"의 평균: "+sc.getAvg());
		
	}
}
