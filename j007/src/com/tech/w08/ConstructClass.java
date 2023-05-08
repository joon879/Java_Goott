package com.tech.w08;

public class ConstructClass {
	//생성자(Constructor) 이해
	//(리턴타입 없는 클래스 이름과 동일한 메소드 형태)
	
	
	
	//기본 생성자는 생략 가능, 자동으로 내부에 생성되어 있음.
	//but! 사용자 생성자가 있을 시엔 기본 생성자 작성 생략 불가?
	
	public ConstructClass() {//기본 생성자
		System.out.println("기본 생성자 호출!!");
	}
	
	public ConstructClass(String name) {//사용자 생성자1
		System.out.println(name+" 호출(사용자 생성자1 호출)");
	}
	
	public ConstructClass(String name, float score) {//사용자 생성자2
		System.out.println(name+"의 점수는(사용자 생성자2 호출): "+score);
	}
	
	public ConstructClass(String string, int i, int j) {//사용자 생성자3
		
	}

	//일반 메소드
	public void aaa() {
		
	}
	
	public static void main(String[] args) {
		new ConstructClass(); //생성자 호출
		
		new ConstructClass("홍길동"); //사용자 생성자1 호출
				
		new ConstructClass("홍길동", 100.0f);//사용자 생성자2 호출
		
		new ConstructClass("홍길동", 100, 100);//사용자 생성자3 호출
		
	}
}
