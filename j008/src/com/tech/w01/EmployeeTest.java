package com.tech.w01;

public class EmployeeTest {
	public static void main(String[] args) {
		// ��� �̸� ���� ���ʽ� ��� ���� �����ϰ� �޿� ����

		Employee emp1 = new RegularEmployee("E001", "ȫ�浿", 3000, 500);
		emp1.getMonthPay();
	}
}
