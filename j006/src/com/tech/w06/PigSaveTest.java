package com.tech.w06;

public class PigSaveTest {
	public static void main(String[] args) {
		PigSave save = new PigSave();
		save.deposit(100);
		save.deposit(10000);
		save.deposit(2000);
		save.deposit(2000);
		
		System.out.println("total: "+save.getTotal());
		save.setTotal(222);
		System.out.println(save.getTotal());
	}
}
