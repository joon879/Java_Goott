package com.tech.w01_3;

public class PartTimeEmployee extends Employee {
	private int workDay;

	public PartTimeEmployee(String empno, String ename, int pay, int workDay) {
		super(empno, ename, pay);
		this.workDay = workDay;
	}

	@Override
	public double getMonthPay() {
		float monthpay = (pay * workDay);
		return monthpay;
	}

}
