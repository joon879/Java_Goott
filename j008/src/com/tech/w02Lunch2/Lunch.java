package com.tech.w02Lunch2;

public abstract class Lunch {
	protected String fname;//�޴�
	protected int fprice;//����
	protected int personCnt;//����
	
	public Lunch(String fname, int fprice, int personCnt) {
		this.fname = fname;
		this.fprice = fprice;
		this.personCnt = personCnt;
	}

	public abstract double getTotal();
	
	
	
}
