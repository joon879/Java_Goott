package com.tech.w06di01;

public class Coffee {
//	private HotAmericano ame;//�̸��� ����.
	private IceAmericano ame;//�̸��� ����.
	
	public Coffee() {//������
//		ame = new HotAmericano(); // ���⿡�� ���� ��ü ����
		ame = new IceAmericano(); // ���⿡�� ���� ��ü ����
		System.out.println("������ constructor");
	}
	
	public void coffeeType() {
		System.out.println(ame.getName());
	}
	
}
