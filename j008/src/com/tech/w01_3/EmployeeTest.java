package com.tech.w01_3;

public class EmployeeTest {
	public static void main(String[] args) {
		// 사번 이름 연봉 보너스 등등 내용 전달하고 급여 산출
		
		//배열활용
		//배열의 각 번지에 각각 다른 생성자로 데이터 전달, 입력
		Employee[] emps = new Employee[4];
		emps[0] = new RegularEmployee("E001", "홍길동", 3000, 500);
		emps[1] = new TempEmployee("E002", "홍길순", 4000, 0);
		emps[2] = new PartTimeEmployee("E003", "황진희", 50, 10);
		emps[3] = new RegularEmployee("E004", "홍길동2", 5000, 1500);
		
//		Employee emp1 = new RegularEmployee("E001", "홍길동", 3000, 500);
//		//E001", "홍길동", 3000만 RegularEmployee에 전달, 500은 Employee에!
//		Employee emp2 = new TempEmployee("E002", "홍길순", 4000, 0);
//		Employee emp3 = new PartTimeEmployee("E003", "황진희", 50, 10);
		
		
//		System.out.println(emps[0]);
//		System.out.println(emps[0].getMonthPay());
//		
//		System.out.println(emps[1]);
//		System.out.println(emps[1].getMonthPay());
//				
//		System.out.println(emps[2]);
//		System.out.println(emps[2].getMonthPay());
		
		
		for (int i = 0; i < emps.length; i++) {
			printPay(emps[i]);
		}
	}

	private static void printPay(Employee emp) {
		System.out.println("=====================");
		System.out.println(emp.empInfo());
		System.out.println("---------------------");
		System.out.println(emp.getMonthPay());
	}
}
