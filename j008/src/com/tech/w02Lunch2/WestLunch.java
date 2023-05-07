package com.tech.w02Lunch2;

public class WestLunch extends Lunch{
	private double discount;
	
	public WestLunch(String fname, int fprice, int personCnt, double discount) {
		super(fname, fprice, personCnt);
		this.discount = discount;
	}

	public double getTotal() {
		double tot=fprice*personCnt*(1-discount);
		return tot;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return fname+":"+fprice+":"+personCnt;
	}
	

}
