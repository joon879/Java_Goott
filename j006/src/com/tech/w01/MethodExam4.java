package com.tech.w01;

public class MethodExam4 {
	public static void main(String[] args) {
		//�ڽ��� Ŭ������ ��ü�� �����
		MethodExam4 m1 = new MethodExam4(); //m1�̶�� ��ü ����.
		
		//ȣ��
		//param�� ����
		int getSum = m1.makeSum(1, 10);
		System.out.println("return: "+getSum);
		System.out.println("return: "+m1.makeSum(1, 10));
		
		
	}
	//makeSum
	//static �� ���� �Լ�: ��ü(m1)�� �����ؾ� (.)���� ȣ�� ����.
	public int makeSum(int getStart, int getEnd) {
		int sum = 0;
		int start = getStart;
		int end = getEnd;
		for (int i = start; i <= end; i++) {
			sum += i;
		}
//		System.out.println("start: "+start);
//		System.out.println("end: "+end);
//		System.out.println("sum: "+sum);
		return sum;
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
