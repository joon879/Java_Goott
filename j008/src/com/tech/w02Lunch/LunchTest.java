package com.tech.w02Lunch;

public class LunchTest {
	public static void main(String[] args) {
//		메뉴이름(승준), 가격, 갯수, 할인률(클래스별 다르게) 전달하여 + 출력
//		토탈 금액 리턴 + 출력
		
		
		Lunch lun1 = new ChinaLunch("짜장면",10000,1,10);
		Lunch lun2 = new OrientLunch("카레",15000,2,20);
		Lunch lun3 = new WestLunch("스테이크",30000,3,30);
		//자식의 함수는 부모 타입의 객체에서 사용 불가.
	
		System.out.println(lun1);
		System.out.println();
		System.out.println(lun2);
		System.out.println();
		System.out.println(lun3);
		
		System.out.println(lun2.dcPrice());
		
	
	}
}
