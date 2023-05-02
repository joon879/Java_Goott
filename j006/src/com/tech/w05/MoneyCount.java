package com.tech.w05;

public class MoneyCount {

//	65430원을 만들기 위한 화폐의 갯수를 구하시오.
//	money=65430원
//	만원 = 6
//	천원 = 5
//	백원 = 4
//	십원 =3


	
	
	public int[] moneyPrint(int money) {
		int[] arr = new int[5];
		
		arr[0] = money / 10000;
		arr[1] = (money - arr[0]*10000) /1000;
		arr[2] = (money - arr[0]*10000 - arr[1]*1000) / 100;
		arr[3] = (money - arr[0]*10000 - arr[1]*1000 - arr[2]*100) / 10;
		arr[4] = (money - arr[0]*10000 - arr[1]*1000 - arr[2]*100 - arr[3]*10);
		
//		System.out.println("만원 갯수: "+man);
//		System.out.println("천원 갯수: "+chun);
//		System.out.println("백원 갯수: "+back);
//		System.out.println("십원 갯수: "+sip);
//		System.out.println("일원 갯수: "+il);
		
		return arr;
	}
}
