package com.tech.w03;

public class MoneyCount {

//	65430���� ����� ���� ȭ���� ������ ���Ͻÿ�.
//	money=65430��
//	���� = 6
//	õ�� = 5
//	��� = 4
//	�ʿ� =3


	
	
	public void moneyPrint(int money) {
		int n = money / 10000;
		int nn = (money - n*10000) /1000;
		int nnn = (money - n*10000 - nn*1000) / 100;
		int nnnn = (money - n*10000 - nn*1000 - nnn*100) / 10;
		
		System.out.println(n);
		System.out.println(nn);
		System.out.println(nnn);
		System.out.println(nnnn);
		
	
	}
}
