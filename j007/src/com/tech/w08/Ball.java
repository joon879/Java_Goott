package com.tech.w08;

public class Ball {
	private double radius;
	//this�� ���. Ŭ���� ���� ������ ����Ŵ.
	
	
	public Ball(double radius) {
//		System.out.println("�θ� Ŭ���� ������ ȣ��");
		System.out.println("1: "+this.radius);
		//BallŬ������ radius ���.
		
		this.radius = radius;//radius �Ű������� BallŬ������ radius�� ����.
		System.out.println("2: "+this.radius);
	}
	@Override
	public String toString() {
		System.out.println("ȣ��");
		return "���� ������: "+radius;
	}

}
