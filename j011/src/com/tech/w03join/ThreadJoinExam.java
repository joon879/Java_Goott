package com.tech.w03join;

public class ThreadJoinExam {
	public static void main(String[] args) {
		ThreadAction thread = new ThreadAction();
		thread.start();
		System.out.println("start!!");
		
		try {
			//Joinó��
			System.out.println(thread.isAlive());
			thread.join(); // ������ ������ ������ ������ �������� ���.
			System.out.println(thread.isAlive());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end!!");
	}
}
