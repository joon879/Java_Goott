package com.tech.w01lamda3;

interface Bank{
	void save(int money); //�߻�޼ҵ�, �Ķ���� ����.
	
}

class Customer{
	public void deposit(Bank saveMoney) {
		saveMoney.save(2000);
		
	}
}

public class LamdaTest3 {
	
	public static void main(String[] args) {
		Customer customer = new Customer();
		//���ٽ��� ������� �ʴ� ǥ�� ���(���� ����)
		
		customer.deposit(new Bank() {
			
			@Override
			public void save(int a) {
				System.out.println("1�� �Աݾ� "+a);
				
			}
		});
		
		System.out.println("--------------------------------");
		//���ٽ��� ����� ǥ�� ���.
		customer.deposit((int a)->{
			System.out.println("1�� �Աݾ� ���ٽ�: "+a);		
			
		});
		//���ٽ��� ����� ǥ�� ��� 2.
		customer.deposit((a)->{ // Ÿ��(int) ���� ����
			System.out.println("1�� �Աݾ� ���ٽ�: "+a);		
			
		});
		//���ٽ��� ����� ǥ�� ��� 3.
				customer.deposit(a->{ //()�� ���� ����(�Ű������� 1�� �� ���� ����)
					System.out.println("1�� �Աݾ� ���ٽ�: "+a);		
					
				});
	}
}
