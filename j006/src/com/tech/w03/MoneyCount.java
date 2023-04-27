package com.tech.w03;

public class MoneyCount {

//	65430원을 만들기 위한 화폐의 갯수를 구하시오.
//	money=65430원
//	만원 = 6
//	천원 = 5
//	백원 = 4
//	십원 =3


	
	
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
