package com.tech.w06;

public class SalaryTest {
	public static void main(String[] args) {
//		급여명세서를 작성하시오
//		조건1) 기본급이 1,500,000원, 수당이 55,000원,
//				세금은 기본급의 10%
//		조건2) 실수령액 = 기본급 + 수당 - 세금
//		
//		출력: 메인에서
		
		Salary sal = new Salary();
		int gibon = 2000000;
		int sudan = 1000000;
		float totMoney = sal.getSalary(gibon, sudan);
		
		System.out.println("실수령액: "+totMoney);
		
	}
}
