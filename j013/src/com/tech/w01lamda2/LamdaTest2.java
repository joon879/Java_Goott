package com.tech.w01lamda2;

interface Bank{
	int save(); //�߻�޼ҵ� -> �Լ��� �������̽�: �������̽��ȿ� �߻�޼ҵ尡 1���ΰ�!
	//�̹����� ���ϰ� �ִ� �޼ҵ�.
	
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
		//���ٽ��� ������� �ʴ� ǥ�� ���(���� ����)
		
		customer.deposit(new Bank() {
			
			@Override
			public int save() {
				System.out.println("1�� �Աݾ� 1000");
				return 1000;
			}
		});
		
		System.out.println("--------------------------------");
		//���ٽ��� ����� ǥ�� ���.
		customer.deposit(()->{
			System.out.println("1�� �Աݾ� 2000���ٽ�");		
			return 2000;
		});
	}
}
