package com.tech.w01_3;

public class EmployeeTest {
	public static void main(String[] args) {
		// ��� �̸� ���� ���ʽ� ��� ���� �����ϰ� �޿� ����
		
		//�迭Ȱ��
		//�迭�� �� ������ ���� �ٸ� �����ڷ� ������ ����, �Է�
		Employee[] emps = new Employee[4];
		emps[0] = new RegularEmployee("E001", "ȫ�浿", 3000, 500);
		emps[1] = new TempEmployee("E002", "ȫ���", 4000, 0);
		emps[2] = new PartTimeEmployee("E003", "Ȳ����", 50, 10);
		emps[3] = new RegularEmployee("E004", "ȫ�浿2", 5000, 1500);
		
//		Employee emp1 = new RegularEmployee("E001", "ȫ�浿", 3000, 500);
//		//E001", "ȫ�浿", 3000�� RegularEmployee�� ����, 500�� Employee��!
//		Employee emp2 = new TempEmployee("E002", "ȫ���", 4000, 0);
//		Employee emp3 = new PartTimeEmployee("E003", "Ȳ����", 50, 10);
		
		
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
