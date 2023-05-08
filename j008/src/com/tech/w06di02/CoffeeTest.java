package com.tech.w06di02;

public class CoffeeTest {
	public static void main(String[] args) {
		
		Americano hot = new HotAmericano();
		Americano ice = new IceAmericano();
		//아래와 같이 객체를 생성하여 객체를 매개변수로 넘겨줄 수 있다.
		
//		Coffee coffee = new Coffee(new IceAmericano());
		Coffee coffee = new Coffee(ice);
		coffee.coffeeType();
	}
}
