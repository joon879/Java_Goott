package com.tech.w01;

public class MethodExam2 {
	public static void main(String[] args) {
		//�ڽ��� Ŭ������ ��ü�� �����
		MethodExam2 m1 = new MethodExam2(); //m1�̶�� ��ü ����.
		
		//ȣ��
		m1.makeSum(); //��ü ���� �� ȣ��.

		
		
	}
	//makeSum
	//static �� ���� �Լ�: ��ü(m1)�� �����ؾ� (.)���� ȣ�� ����.
	public void makeSum() {
		int sum = 0;
		int start = 50;
		int end = 100;
		for (int i = start; i < end; i++) {
			sum += i;
		}
		System.out.println("start: "+start);
		System.out.println("end: "+end);
		System.out.println("sum: "+sum);
	}

//	//static���� �Լ�: ó������ �޸𸮿� �÷��д�. �Լ� ȣ�� �� ��ü �ʿ� ����.
//	private static void makeSum() {
//		System.out.println("makeSum !!");
//		
//	}
	

}
