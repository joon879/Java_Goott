package com.tech.w03;

import java.util.Scanner;

public class MoneyCountTest {
	public static void main(String[] args) {
		MoneyCount mc = new MoneyCount();
//		int money = 75137;
//		mc.moneyPrint(money);
//		
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		
		mc.moneyPrint(money);
		System.out.println();
		
		
		
	}
}
