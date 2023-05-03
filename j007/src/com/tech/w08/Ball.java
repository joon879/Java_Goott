package com.tech.w08;

public class Ball {
	private double radius;
	//this의 사용. 클래스 내의 변수를 가르킴.
	
	
	public Ball(double radius) {
//		System.out.println("부모 클래스 생성자 호출");
		System.out.println("1: "+this.radius);
		//Ball클래스의 radius 출력.
		
		this.radius = radius;//radius 매개변수를 Ball클래스의 radius에 대입.
		System.out.println("2: "+this.radius);
	}
	@Override
	public String toString() {
		System.out.println("호출");
		return "공의 반지름: "+radius;
	}

}
