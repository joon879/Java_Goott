package com.tech.w08;

public class BallTest extends Ball{
	public static void main(String[] args) {
		BallTest ball = new BallTest(50);
		
		System.out.println("Ball: "+ball);
	}

	public BallTest(double radius) {//����� ������
//		System.out.println("hihihi");
		super(radius);//super() -> �θ� Ŭ���� (�����)������ ȣ��
	}
	
}
