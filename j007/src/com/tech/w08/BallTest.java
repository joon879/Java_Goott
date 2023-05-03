package com.tech.w08;

public class BallTest extends Ball{
	public static void main(String[] args) {
		BallTest ball = new BallTest(50);
		
		System.out.println("Ball: "+ball);
	}

	public BallTest(double radius) {//사용자 생성자
//		System.out.println("hihihi");
		super(radius);//super() -> 부모 클래스 (사용자)생성자 호출
	}
	
}
