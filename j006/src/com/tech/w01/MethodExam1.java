package com.tech.w01;

public class MethodExam1 {
	public static void main(String[] args) {
		//�ڽ��� Ŭ������ ��ü�� �����
		MethodExam1 m1 = new MethodExam1(); //m1�̶�� ��ü ����.
		
		//ȣ��
		m1.makeSum(); //��ü ���� �� ȣ��.
//		makeSum(); //��ü ���� ���� ȣ��.
		m1.hihi();
		
		
	}
	//makeSum
	//static �� ���� �Լ�: ��ü(m1)�� �����ؾ� (.)���� ȣ�� ����.
	public void makeSum() {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += i;
		}
		System.out.println("makeSum !!:"+sum);
	}

//	//static���� �Լ�: ó������ �޸𸮿� �÷��д�. �Լ� ȣ�� �� ��ü �ʿ� ����.
//	private static void makeSum() {
//		System.out.println("makeSum !!");
//		
//	}
	
	public void hihi() {
		System.out.println("hi ������");
	}
}
