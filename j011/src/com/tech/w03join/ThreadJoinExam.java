package com.tech.w03join;

public class ThreadJoinExam {
	public static void main(String[] args) {
		ThreadAction thread = new ThreadAction();
		thread.start();
		System.out.println("start!!");
		
		try {
			//Join처리
			System.out.println(thread.isAlive());
			thread.join(); // 스레드 동작이 중지될 때까지 다음실행 대기.
			System.out.println(thread.isAlive());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end!!");
	}
}
