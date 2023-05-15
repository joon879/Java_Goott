package com.tech.w04priority;

public class PriorityExam {
	public static void main(String[] args) {
		
		//������ �켱���� 1~10. ���ڰ� ������ �켱������ ����.
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		
		//������ �켱����. �⺻���� 5.
		System.out.println("Priority of t1: "+t1.getPriority());
		System.out.println("Priority of t2: "+t2.getPriority());
		
		//�켱���� ����1
		t1.setPriority(9);
		t2.setPriority(1);
		System.out.println("Priority of t1: "+t1.getPriority());
		System.out.println("Priority of t2: "+t2.getPriority());
		
		//�켱���� ����2
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Priority of t1: "+t1.getPriority());
		System.out.println("Priority of t2: "+t2.getPriority());
	}
}
