package com.tech.w01_3;

public abstract class Employee {
	protected String empno; // ���
	protected String ename; // �̸�
	protected int pay; // �޿�

	public Employee(String empno, String ename, int pay) {
		this.empno = empno;
		this.ename = ename;
		this.pay = pay;
	}
	public abstract double getMonthPay(); //�߻� �޼ҵ�! �ڽ�Ŭ�������� �������̵� �� �����ؾ� ��.
	
//	@Override
//	public String toString() {
//		return empno+":"+ename+":"+pay;
//	}//��ü��ü�� sys.out�ϸ� �ڵ����� Object�� toString()�Լ��� ȣ���Ѵ�.
//	//�׷��� toString�� �������̵��ؼ� ���ϴ� ������ �����ϰ� �Ͽ� ��� ����.
	
	public String empInfo() {
		return empno+":"+ename+":"+pay;
	}//toString �������̵��� �Ͱ� ����.
}
