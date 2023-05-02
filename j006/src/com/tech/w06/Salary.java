package com.tech.w06;

public class Salary {
	public float getSalary(int gibon, int sudan) {
		float money = gibon + sudan - (gibon*0.1f);

		return money;
	}
}
