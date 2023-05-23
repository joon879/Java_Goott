package com.tech.w01lamda2;

interface Bank{
	int save(); //추상메소드 -> 함수형 인터페이스: 인터페이스안에 추상메소드가 1개인거!
	//이번에는 리턴값 있는 메소드.
	
}

class Customer{
	public void deposit(Bank saveMoney) {
		int rMoney = saveMoney.save();
		System.out.println("money: "+rMoney);
	}
}

public class LamdaTest2 {
	
	public static void main(String[] args) {
		Customer customer = new Customer();
		//람다식을 사용하지 않는 표현 방법(기존 배운거)
		
		customer.deposit(new Bank() {
			
			@Override
			public int save() {
				System.out.println("1번 입금액 1000");
				return 1000;
			}
		});
		
		System.out.println("--------------------------------");
		//람다식을 사용한 표현 방법.
		customer.deposit(()->{
			System.out.println("1번 입금액 2000람다식");		
			return 2000;
		});
	}
}
