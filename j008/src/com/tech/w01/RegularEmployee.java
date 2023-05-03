package com.tech.w01;

public class RegularEmployee extends Employee{
	private int bonus;
	
	public RegularEmployee(String empno, String ename, int pay, int bonus) {
		super(empno, ename, pay);
		this.bonus = bonus;
	}
	public double getMonthPay() {
		
		return 0;
	}
	
}
