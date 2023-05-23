package com.tech.w01lamda;

interface Bank{
	void save(); //�߻�޼ҵ�, �������̽��ȿ� �ϳ��� �Լ��� �ִ°� -> �Լ��� �������̽�.
	
}

class Customer{
	public void deposit(Bank saveMoney) {
		saveMoney.save();
	}
}

public class LamdaTest1 {
	public static void main(String[] args) {
		Customer customer = new Customer();
		//���ٽ��� ������� �ʴ� ǥ�� ���(���� ����)
		customer.deposit(new Bank() {
			
			@Override
			public void save() {
				System.out.println("1�� �Աݾ� 1000");
				
			}
		});
		System.out.println("--------------------------------");
		//���ٽ��� ����� ǥ�� ���.
		customer.deposit(()->{
			System.out.println("1�� �Աݾ� 1000���ٽ�");			
		});
	}
}
