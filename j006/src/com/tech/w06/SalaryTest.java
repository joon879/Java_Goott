package com.tech.w06;

public class SalaryTest {
	public static void main(String[] args) {
//		�޿������� �ۼ��Ͻÿ�
//		����1) �⺻���� 1,500,000��, ������ 55,000��,
//				������ �⺻���� 10%
//		����2) �Ǽ��ɾ� = �⺻�� + ���� - ����
//		
//		���: ���ο���
		
		Salary sal = new Salary();
		int gibon = 2000000;
		int sudan = 1000000;
		float totMoney = sal.getSalary(gibon, sudan);
		
		System.out.println("�Ǽ��ɾ�: "+totMoney);
		
	}
}
