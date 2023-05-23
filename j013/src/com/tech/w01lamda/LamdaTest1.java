package com.tech.w01lamda;

interface Bank{
	void save(); //추상메소드, 인터페이스안에 하나의 함수만 있는거 -> 함수형 인터페이스.
	
}

class Customer{
	public void deposit(Bank saveMoney) {
		saveMoney.save();
	}
}

public class LamdaTest1 {
	public static void main(String[] args) {
		Customer customer = new Customer();
		//람다식을 사용하지 않는 표현 방법(기존 배운거)
		customer.deposit(new Bank() {
			
			@Override
			public void save() {
				System.out.println("1번 입금액 1000");
				
			}
		});
		System.out.println("--------------------------------");
		//람다식을 사용한 표현 방법.
		customer.deposit(()->{
			System.out.println("1번 입금액 1000람다식");			
		});
	}
}
