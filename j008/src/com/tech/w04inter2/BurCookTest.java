package com.tech.w04inter2;

public class BurCookTest {
	public static void main(String[] args) {
		BurCook cook1 = new FastCook();
		BurCook cook2 = new HotelCook();
		
		cook1.makeBur();
		cook1.makeSalad();
		cook2.makeBur();
		cook2.makeSalad();
		
	}
}
