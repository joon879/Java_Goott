package com.tech.w04inter2;

public class TotalCook implements BurCook, HomeCook{

	@Override
	public void makeRiceBur() {
		// TODO Auto-generated method stub
		System.out.println("home Rice");
	}

	@Override
	public void makeBur() {
		// TODO Auto-generated method stub
		System.out.println("home bur");
	}

	@Override
	public void makeSalad() {
		// TODO Auto-generated method stub
		System.out.println("home salad");
	}

}
