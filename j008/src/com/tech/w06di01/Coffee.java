package com.tech.w06di01;

public class Coffee {
//	private HotAmericano ame;//이름만 선언.
	private IceAmericano ame;//이름만 선언.
	
	public Coffee() {//생성자
//		ame = new HotAmericano(); // 여기에서 실제 객체 생성
		ame = new IceAmericano(); // 여기에서 실제 객체 생성
		System.out.println("생성자 constructor");
	}
	
	public void coffeeType() {
		System.out.println(ame.getName());
	}
	
}
