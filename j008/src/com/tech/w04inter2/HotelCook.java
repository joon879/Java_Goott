package com.tech.w04inter2;

public class HotelCook implements BurCook{

	@Override
	public void makeBur() {
		System.out.println("hotel burger");
	}

	@Override
	public void makeSalad() {
		System.out.println("hotel salad");
	}
	
	
}
