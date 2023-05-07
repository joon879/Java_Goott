package com.tech.w02Lunch2;

public class LunchTest {
	public static void main(String[] args) {
//		메뉴이름(승준), 가격, 갯수, 할인률(클래스별 다르게) 전달하여 + 출력
//		토탈 금액 리턴 + 출력
		Lunch[] lunch = new Lunch[3];
		lunch[0] = new ChinaLunch("마라탕",10000,3,0.4);
		lunch[1] = new OrientLunch("소갈비",20000,5,0.3);
		lunch[2] = new WestLunch("안심스",30000,4,0.15);
		
		for (int i = 0; i < lunch.length; i++) {
			System.out.println("=================");
			System.out.println(lunch[i]);
			System.out.println(lunch[i].getTotal());
		}
	}
}
