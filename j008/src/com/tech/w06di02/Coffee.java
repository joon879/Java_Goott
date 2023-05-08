package com.tech.w06di02;

public class Coffee {
	//인터페이스를 접목한 di구현.
//	private HotAmericano ame;//이름만 선언.
//	private IceAmericano ame;//이름만 선언.
	private Americano ame; //인터페이스 Americano 객체 생성.
	
	public Coffee(Americano ame) {//생성자에 매개변수로 인터페이스 객체를 전달.
//		ame = new HotAmericano(); // 여기에서 실제 객체 생성
//		ame = new IceAmericano(); // 여기에서 실제 객체 생성
		
		this.ame = ame;
		System.out.println("생성자 constructor");
	}
	
	public void coffeeType() {
		System.out.println(ame.getName());
	}
	
}
