package com.tech.w06di02;

public class Coffee {
	//�������̽��� ������ di����.
//	private HotAmericano ame;//�̸��� ����.
//	private IceAmericano ame;//�̸��� ����.
	private Americano ame; //�������̽� Americano ��ü ����.
	
	public Coffee(Americano ame) {//�����ڿ� �Ű������� �������̽� ��ü�� ����.
//		ame = new HotAmericano(); // ���⿡�� ���� ��ü ����
//		ame = new IceAmericano(); // ���⿡�� ���� ��ü ����
		
		this.ame = ame;
		System.out.println("������ constructor");
	}
	
	public void coffeeType() {
		System.out.println(ame.getName());
	}
	
}
