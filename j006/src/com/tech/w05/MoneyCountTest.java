package com.tech.w05;

import java.util.Scanner;

public class MoneyCountTest {
	public static void main(String[] args) {
		MoneyCount mc = new MoneyCount();
		int money = 75137;
		mc.moneyPrint(money);
		
		int[] rArr = mc.moneyPrint(money);
//		Scanner scan = new Scanner(System.in);
//		int money = scan.nextInt();
		
		System.out.println("���� ����: "+rArr[0]);
		System.out.println("õ�� ����: "+rArr[1]);
		System.out.println("��� ����: "+rArr[2]);
		System.out.println("�ʿ� ����: "+rArr[3]);
		System.out.println("�Ͽ� ����: "+rArr[4]);
				
	}
}
