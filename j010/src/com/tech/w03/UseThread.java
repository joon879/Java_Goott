package com.tech.w03;

//스레드 클래스를 상속하여 구현
public class UseThread extends Thread {
	private String message;
	
	public UseThread(String message) {
		this.message = message;
	}
	
	//스레드에서 start()가 run()을 호출한다.
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+": "+message);
		}
	}
	
	public static void main(String[] args) {
		new UseThread("서울").start();
		new UseThread("Seoul").start();
//		new UseThread("서울").run();
//		new UseThread("Seoul").run();
	}
}
