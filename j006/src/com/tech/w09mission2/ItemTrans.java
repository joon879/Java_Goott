package com.tech.w09mission2;

public class ItemTrans {
	private int point;
	private int total;
	
	public void getItem(String move) {
		if(move=="����") {
			point = 1000;
			total = total + point;
		} else if(move=="��������") {
			point = 3000;
			total = total + point;
		} else if(move=="ų") {
			point = 5000;
			total = total + point;
		}
	}

	public int getPoint() {
		return point;
	}

	public int getTotal() {
		return total;
	}

	
}
