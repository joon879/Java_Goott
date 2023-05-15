package com.tech.w04priority;

public class PriorityExam {
	public static void main(String[] args) {
		
		//스레드 우선순위 1~10. 숫자가 높으면 우선순위는 높다.
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		
		//현재의 우선순위. 기본값은 5.
		System.out.println("Priority of t1: "+t1.getPriority());
		System.out.println("Priority of t2: "+t2.getPriority());
		
		//우선순위 변경1
		t1.setPriority(9);
		t2.setPriority(1);
		System.out.println("Priority of t1: "+t1.getPriority());
		System.out.println("Priority of t2: "+t2.getPriority());
		
		//우선순위 변경2
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Priority of t1: "+t1.getPriority());
		System.out.println("Priority of t2: "+t2.getPriority());
	}
}
