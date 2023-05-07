package com.tech.w01_2;

public class TempEmployee extends Employee{
	private int hireyear;

	public TempEmployee(String empno, String ename, int pay, int hireyear) {
		super(empno, ename, pay);
		this.hireyear = hireyear;
	}

	@Override
	public double getMonthPay() {
		float monthpay = (pay / 12);
		return monthpay;
	}

}
