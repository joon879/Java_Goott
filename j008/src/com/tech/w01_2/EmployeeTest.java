package com.tech.w01_2;

public class EmployeeTest {
	public static void main(String[] args) {
		// ��� �̸� ���� ���ʽ� ��� ���� �����ϰ� �޿� ����

		Employee emp1 = new RegularEmployee("E001", "ȫ�浿", 3000, 500);
		//E001", "ȫ�浿", 3000�� RegularEmployee�� ����, 500�� Employee��
		Employee emp2 = new TempEmployee("E002", "ȫ���", 4000, 0);
		
		System.out.println(emp1);
		System.out.println(emp1.getMonthPay());
		
		System.out.println(emp2);
		System.out.println(emp2.getMonthPay());
		
		Employee emp3 = new PartTimeEmployee("E003", "Ȳ����", 50, 10);
		
		System.out.println(emp3);
		System.out.println(emp3.getMonthPay());
	}
}
