package com.tech.w01lamda5;

interface Bank {
	void save(int bunho, int money); // 추상메소드

}

interface Card {
	void save(String name, int money); // 추상메소드 2.

}

class Customer {
	public void deposit(Bank saveMoney) {
		saveMoney.save(1, 2000);
	}
	
	public void deposit(Card saveMoney) {
		saveMoney.save("hong", 2000);
	}
}

public class LamdaTest5 {

	public static void main(String[] args) {
		Customer customer = new Customer();
		// 람다식을 사용하지 않는 표현 방법(기존 배운거)

		customer.deposit(new Bank() {

			@Override
			public void save(int bunho, int money) {
				System.out.println(bunho + "번 입금액 " + money);

			}
		});

		System.out.println("--------------------------------");
		// 람다식을 사용한 표현 방법.
		customer.deposit((int a, int b) -> {
			System.out.println(a + "번 입금액 람다식 bank: " + b);

		});
		
		// 람다식을 사용한 표현 방법.
		customer.deposit((String a, int b) -> {
			System.out.println(a + "번 입금액 람다식 card: " + b);

		});
		
	}
}
