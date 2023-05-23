package com.tech.w01lamda3;

interface Bank{
	void save(int money); //추상메소드, 파라미터 있음.
	
}

class Customer{
	public void deposit(Bank saveMoney) {
		saveMoney.save(2000);
		
	}
}

public class LamdaTest3 {
	
	public static void main(String[] args) {
		Customer customer = new Customer();
		//람다식을 사용하지 않는 표현 방법(기존 배운거)
		
		customer.deposit(new Bank() {
			
			@Override
			public void save(int a) {
				System.out.println("1번 입금액 "+a);
				
			}
		});
		
		System.out.println("--------------------------------");
		//람다식을 사용한 표현 방법.
		customer.deposit((int a)->{
			System.out.println("1번 입금액 람다식: "+a);		
			
		});
		//람다식을 사용한 표현 방법 2.
		customer.deposit((a)->{ // 타입(int) 생략 가능
			System.out.println("1번 입금액 람다식: "+a);		
			
		});
		//람다식을 사용한 표현 방법 3.
				customer.deposit(a->{ //()도 생략 가능(매개변수가 1개 일 때만 가능)
					System.out.println("1번 입금액 람다식: "+a);		
					
				});
	}
}
