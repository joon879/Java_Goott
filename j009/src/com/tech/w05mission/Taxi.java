package com.tech.w05mission;

public class Taxi extends Trans{
	private int price;
	
	
	public Taxi(int people, int distance, int price) {
		super(people, distance);
		this.price = price;
	}


	@Override
	public double getCharge() {
		double total = people*distance*price;
		return total;
	}
}
