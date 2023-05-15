package com.tech.w03;

//스레드 인터페이스를 상속하여 구현
public class UseRunnable implements Runnable {
	private String message;

	public UseRunnable(String message) {
		this.message = message;
	}

	// 스레드에서 start()가 run()을 호출한다.
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + ": " + message);
		}
	}

	public static void main(String[] args) {
		new Thread(new UseRunnable("서울")).start();
		new Thread(new UseRunnable("Seoul")).start();
	}
}
