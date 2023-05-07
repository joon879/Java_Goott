package com.tech.w02Lunch2;

public class ChinaLunch extends Lunch{
	private double discount;	
	
	public ChinaLunch(String fname, int fprice, int personCnt, double discount) {
		super(fname, fprice, personCnt);
		this.discount = discount;
	}
	public double getTotal() {
		double tot=fprice*personCnt*(1-discount);
		return tot;
	}

}
