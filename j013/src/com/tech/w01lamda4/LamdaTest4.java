package com.tech.w01lamda4;

interface Bank {
	void save(int bunho, int money); // �߻�޼ҵ�

}

class Customer {
	public void deposit(Bank saveMoney) {
		saveMoney.save(1, 2000);
	}
}

public class LamdaTest4 {

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
			System.out.println(a + "�� �Աݾ� ���ٽ�: " + b);

		});
		// ���ٽ��� ����� ǥ�� ��� 2.
		customer.deposit((a, b) -> { // Ÿ��(int) ���� ����
			System.out.println(a + "�� �Աݾ� ���ٽ�: " + b);

		});
		// ���ٽ��� ����� ǥ�� ��� 3.
		customer.deposit((a, b) -> { // �Ű������� 2�� �̻��̸� ��ȣ() ���� �Ұ�
			System.out.println("1�� �Աݾ� ���ٽ�: " + a);

		});
	}
}
