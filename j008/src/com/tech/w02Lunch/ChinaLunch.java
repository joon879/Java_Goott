package com.tech.w02Lunch;

public class ChinaLunch extends Lunch{
	protected int dc;	
	
	public ChinaLunch(String mname, int price, int cnt, int dc) {
		super(mname, price, cnt);
		this.dc = dc;
	}

	@Override
	public double dcPrice() {
		double dctotal = (price * cnt * dc / 100);
		return dctotal;
	}

	public int getDc() {
		return dc;
	}
	@Override
	public double lastPrice() {
		double lastPrice = (price * cnt) - (price * cnt * dc / 100);
		return lastPrice;
	}
	@Override
	public String toString() {
		return super.toString() + ": 할인율: " + getDc() + "% 적용(-"+dcPrice()+"할인) 후 최종금액: " + lastPrice();
	}
}
