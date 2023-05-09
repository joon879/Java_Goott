package com.tech.w06di02;

public class CoffeeTest {
	public static void main(String[] args) {
		
//		HotAmericano hot = new HotAmericano();
//		IceAmericano ice = new IceAmericano();
		//아래와 동일. 이해하기엔 아래가 더 나은듯?
		
		Americano hot = new HotAmericano();
		Americano ice = new IceAmericano();
		//아래와 같이 객체를 생성하여 객체를 매개변수로 넘겨줄 수 있다.
		
//		Coffee coffee = new Coffee(new IceAmericano());
		Coffee coffee = new Coffee(ice);
		coffee.coffeeType();
	}
}
