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
		
		System.out.println("¸¸¿ø °¹¼ö: "+rArr[0]);
		System.out.println("Ãµ¿ø °¹¼ö: "+rArr[1]);
		System.out.println("¹é¿ø °¹¼ö: "+rArr[2]);
		System.out.println("½Ê¿ø °¹¼ö: "+rArr[3]);
		System.out.println("ÀÏ¿ø °¹¼ö: "+rArr[4]);
				
	}
}
