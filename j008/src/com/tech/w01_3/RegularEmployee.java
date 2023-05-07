package com.tech.w01_3;

public class RegularEmployee extends Employee{
	private int bonus;
	
	public RegularEmployee(String empno, String ename, int pay, int bonus) {
		super(empno, ename, pay);
		this.bonus = bonus;
	}
	@Override
	public double getMonthPay() {//�Ѵޱ޿� ���
		float monthpay = (pay / 12) + (bonus /12);
		return monthpay;
	}
	
	
}
