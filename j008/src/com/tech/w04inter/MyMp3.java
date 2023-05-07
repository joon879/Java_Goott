package com.tech.w04inter;

public interface MyMp3 {
//	인터페이스란 추상메소드의 집합.
	
	
	//abstract 키워드 생략 가능. 애초에 인터페이스는 추상메소드들 모아둔거다.
	public abstract void playMp3();
	public void listenFm();
	void viewPhoto(); //public 없으면 default.
	
//	public void aaa() {
//		
//	}
	
}
