package com.tech.w05;

public class MoneyCount {

//	65430���� ����� ���� ȭ���� ������ ���Ͻÿ�.
//	money=65430��
//	���� = 6
//	õ�� = 5
//	��� = 4
//	�ʿ� =3


	
	
	public int[] moneyPrint(int money) {
		int[] arr = new int[5];
		
		arr[0] = money / 10000;
		arr[1] = (money - arr[0]*10000) /1000;
		arr[2] = (money - arr[0]*10000 - arr[1]*1000) / 100;
		arr[3] = (money - arr[0]*10000 - arr[1]*1000 - arr[2]*100) / 10;
		arr[4] = (money - arr[0]*10000 - arr[1]*1000 - arr[2]*100 - arr[3]*10);
		
//		System.out.println("���� ����: "+man);
//		System.out.println("õ�� ����: "+chun);
//		System.out.println("��� ����: "+back);
//		System.out.println("�ʿ� ����: "+sip);
//		System.out.println("�Ͽ� ����: "+il);
		
		return arr;
	}
}
