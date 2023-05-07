package com.tech.w02Lunch;

public abstract class Lunch {
	protected String mname;//�޴�
	protected int price;//����
	protected int cnt;//����

	
	
	public Lunch(String mname, int price, int cnt) {
		this.mname = mname;
		this.price = price;
		this.cnt = cnt;
	}
	public abstract double dcPrice();
	public abstract double lastPrice();
	
	@Override
	public String toString() {
		return mname+":"+price+"��x"+cnt+"��= "+(price*cnt);
	}

	
	
}
