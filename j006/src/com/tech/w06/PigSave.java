package com.tech.w06;

public class PigSave {
	private int total;
	
	public void deposit(int amount) {
		System.out.println(amount+"�� ����");
		total += amount; // total�� ����
	}
	//private ���� ������ �Լ��� ���ش�.

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
}
