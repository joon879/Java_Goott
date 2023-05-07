package com.tech.w02Lunch2;

public abstract class Lunch {
	protected String fname;//메뉴
	protected int fprice;//가격
	protected int personCnt;//갯수
	
	public Lunch(String fname, int fprice, int personCnt) {
		this.fname = fname;
		this.fprice = fprice;
		this.personCnt = personCnt;
	}

	public abstract double getTotal();
	
	
	
}
