package com.tech.w06di02;

public class CoffeeTest {
	public static void main(String[] args) {
		
//		HotAmericano hot = new HotAmericano();
//		IceAmericano ice = new IceAmericano();
		//�Ʒ��� ����. �����ϱ⿣ �Ʒ��� �� ������?
		
		Americano hot = new HotAmericano();
		Americano ice = new IceAmericano();
		//�Ʒ��� ���� ��ü�� �����Ͽ� ��ü�� �Ű������� �Ѱ��� �� �ִ�.
		
//		Coffee coffee = new Coffee(new IceAmericano());
		Coffee coffee = new Coffee(ice);
		coffee.coffeeType();
	}
}
