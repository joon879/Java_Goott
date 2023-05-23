package com.tech.w01lamda4;

interface Bank {
	void save(int bunho, int money); // 추상메소드

}

class Customer {
	public void deposit(Bank saveMoney) {
		saveMoney.save(1, 2000);
	}
}

public class LamdaTest4 {

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
			System.out.println(a + "번 입금액 람다식: " + b);

		});
		// 람다식을 사용한 표현 방법 2.
		customer.deposit((a, b) -> { // 타입(int) 생략 가능
			System.out.println(a + "번 입금액 람다식: " + b);

		});
		// 람다식을 사용한 표현 방법 3.
		customer.deposit((a, b) -> { // 매개변수가 2개 이상이면 괄호() 생략 불가
			System.out.println("1번 입금액 람다식: " + a);

		});
	}
}
