package com.tech.w03;

//������ �������̽��� ����Ͽ� ����
public class UseRunnable implements Runnable {
	private String message;

	public UseRunnable(String message) {
		this.message = message;
	}

	// �����忡�� start()�� run()�� ȣ���Ѵ�.
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + ": " + message);
		}
	}

	public static void main(String[] args) {
		new Thread(new UseRunnable("����")).start();
		new Thread(new UseRunnable("Seoul")).start();
	}
}
