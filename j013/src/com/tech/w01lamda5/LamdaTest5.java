package com.tech.w01lamda5;

interface Bank {
	void save(int bunho, int money); // �߻�޼ҵ�

}

interface Card {
	void save(String name, int money); // �߻�޼ҵ� 2.

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
		// ���ٽ��� ������� �ʴ� ǥ�� ���(���� ����)

		customer.deposit(new Bank() {

			@Override
			public void save(int bunho, int money) {
				System.out.println(bunho + "�� �Աݾ� " + money);

			}
		});

		System.out.println("--------------------------------");
		// ���ٽ��� ����� ǥ�� ���.
		customer.deposit((int a, int b) -> {
			System.out.println(a + "�� �Աݾ� ���ٽ� bank: " + b);

		});
		
		// ���ٽ��� ����� ǥ�� ���.
		customer.deposit((String a, int b) -> {
			System.out.println(a + "�� �Աݾ� ���ٽ� card: " + b);

		});
		
	}
}
