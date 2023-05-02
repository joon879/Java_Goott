package com.tech.w06;

public class PigSave {
	private int total;
	
	public void deposit(int amount) {
		System.out.println(amount+"금 저축");
		total += amount; // total에 누적
	}
	//private 변수 접근을 함수로 해준다.

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
}
