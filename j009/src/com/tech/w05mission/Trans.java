package com.tech.w05mission;

public abstract class Trans {
	protected int people;
	protected int distance;

	
	public Trans(int people, int distance) {
		this.people = people;
		this.distance = distance;
	}
	
	public abstract double getCharge();
}
