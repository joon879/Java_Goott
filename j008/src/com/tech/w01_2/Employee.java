package com.tech.w01_2;

public abstract class Employee {
	protected String empno; // 사번
	protected String ename; // 이름
	protected int pay; // 급여

	public Employee(String empno, String ename, int pay) {
		this.empno = empno;
		this.ename = ename;
		this.pay = pay;
	}
	public abstract double getMonthPay(); //추상 메소드!
	
	@Override
	public String toString() {
		return empno+":"+ename+":"+pay;
	}//객체자체를 sys.out하면 자동으로 Object의 toString()함수를 호출한다.
	//그래서 toString을 오버라이드해서 원하는 정보를 리턴하게 하여 사용 가능.
}
