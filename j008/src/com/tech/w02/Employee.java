package com.tech.w02;

public abstract class Employee {
	//클래스에 추상메소드가 1개이상 존재하면 그 클래스는 추상클래스이다.
	
	private String empno; // 사번
	private String ename; // 이름
	private int pay; // 급여
	
	
	//추상메소드(abstract)
	public abstract void getMonthPay();
	public abstract void getMonthPay2();
	public abstract void getMonthPay3();
	
	
	//일반메소드
	public void ppp() {
		
	}
	
}
