package com.tech.w03;

//������ Ŭ������ ����Ͽ� ����
public class UseThread extends Thread {
	private String message;
	
	public UseThread(String message) {
		this.message = message;
	}
	
	//�����忡�� start()�� run()�� ȣ���Ѵ�.
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+": "+message);
		}
	}
	
	public static void main(String[] args) {
		new UseThread("����").start();
		new UseThread("Seoul").start();
//		new UseThread("����").run();
//		new UseThread("Seoul").run();
	}
}
