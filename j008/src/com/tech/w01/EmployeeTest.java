package com.tech.w01;

public class EmployeeTest {
	public static void main(String[] args) {
		// ��� �̸� ���� ���ʽ� ��� ���� �����ϰ� �޿� ����

		Employee emp1 = new RegularEmployee("E001", "ȫ�浿", 3000, 500);
		//E001", "ȫ�浿", 3000���� Employee(�θ�)�� ����, 
		//500�� RegularEmployee(�ڽ�) �����ڿ��� ó���Ѵ�.
		
		System.out.println(emp1);
		System.out.println(emp1.getMonthPay());
	}
}
