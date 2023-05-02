package com.tech.w07;

public class AClass {

	private int pri = 1;
	int def = 2; //default
	protected int pro = 3;
	public int pub = 4;
	
	private void accessVal() {
		AClass mine = new AClass();
		System.out.println(mine.pri);
		//private 변수, 같은 클래스 내에서는 접근 가능

	}
}
