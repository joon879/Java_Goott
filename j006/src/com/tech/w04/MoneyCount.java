package com.tech.w04;

public class MoneyCount {

//	65430���� ����� ���� ȭ���� ������ ���Ͻÿ�.
//	money=65430��
//	���� = 6
//	õ�� = 5
//	��� = 4
//	�ʿ� =3


	
	
	public void moneyPrint(int money) {
		int man = money / 10000;
		int chun = (money - man*10000) /1000;
		int back = (money - man*10000 - chun*1000) / 100;
		int sip = (money - man*10000 - chun*1000 - back*100) / 10;
		
		System.out.println("���� ����: "+man);
		System.out.println("õ�� ����: "+chun);
		System.out.println("��� ����: "+back);
		System.out.println("�ʿ� ����: "+sip);
		
	
	}
}
