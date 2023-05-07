package com.tech.w02Lunch;

public abstract class Lunch {
	protected String mname;//메뉴
	protected int price;//가격
	protected int cnt;//갯수

	
	
	public Lunch(String mname, int price, int cnt) {
		this.mname = mname;
		this.price = price;
		this.cnt = cnt;
	}
	public abstract double dcPrice();
	public abstract double lastPrice();
	
	@Override
	public String toString() {
		return mname+":"+price+"원x"+cnt+"개= "+(price*cnt);
	}

	
	
}
