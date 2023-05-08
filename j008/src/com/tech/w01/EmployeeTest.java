package com.tech.w01;

public class EmployeeTest {
	public static void main(String[] args) {
		// 사번 이름 연봉 보너스 등등 내용 전달하고 급여 산출

		Employee emp1 = new RegularEmployee("E001", "홍길동", 3000, 500);
		//E001", "홍길동", 3000만은 Employee(부모)에 전달, 
		//500은 RegularEmployee(자식) 생성자에서 처리한다.
		
		System.out.println(emp1);
		System.out.println(emp1.getMonthPay());
	}
}
