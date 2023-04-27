package com.tech.w04;

public class MoneyCount {

//	65430원을 만들기 위한 화폐의 갯수를 구하시오.
//	money=65430원
//	만원 = 6
//	천원 = 5
//	백원 = 4
//	십원 =3


	
	
	public void moneyPrint(int money) {
		int man = money / 10000;
		int chun = (money - man*10000) /1000;
		int back = (money - man*10000 - chun*1000) / 100;
		int sip = (money - man*10000 - chun*1000 - back*100) / 10;
		
		System.out.println("만원 갯수: "+man);
		System.out.println("천원 갯수: "+chun);
		System.out.println("백원 갯수: "+back);
		System.out.println("십원 갯수: "+sip);
		
	
	}
}
