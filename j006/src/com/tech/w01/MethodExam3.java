package com.tech.w01;

public class MethodExam3 {
	public static void main(String[] args) {
		//�ڽ��� Ŭ������ ��ü�� �����
		MethodExam3 m1 = new MethodExam3(); //m1�̶�� ��ü ����.
		
		//ȣ��
		//param�� ����
		m1.makeSum(1, 10);
		m1.makeSum(10, 10000);
		m1.makeSum(15, 5000);

		
		
	}
	//makeSum
	//static �� ���� �Լ�: ��ü(m1)�� �����ؾ� (.)���� ȣ�� ����.
	public void makeSum(int getStart, int getEnd) {
		int sum = 0;
		int start = getStart;
		int end = getEnd;
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.println("start: "+start);
		System.out.println("end: "+end);
		System.out.println("sum: "+sum);
	}
	
//	public void makeSum(int a, int b) {
//		System.out.println("�Ķ�����ִ°� ȣ��!!");
//	}

//	//static���� �Լ�: ó������ �޸𸮿� �÷��д�. �Լ� ȣ�� �� ��ü �ʿ� ����.
//	private static void makeSum() {
//		System.out.println("makeSum !!");
//		
//	}
	

}
