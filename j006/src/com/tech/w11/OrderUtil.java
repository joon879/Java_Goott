package com.tech.w11;

public class OrderUtil {
	
	//static�� ������ ��ü���� �����Ѵ�.
	private static int count;
	
	
	public static void main(String[] args) {
		OrderUtil u1 = new OrderUtil();
		OrderUtil u2 = new OrderUtil();
		OrderUtil u3 = new OrderUtil();
		
		//static�̱⿡ ���� count�� �̾ ī��Ʈ�ȴ�.
		u1.pressButton();
		u1.pressButton();
		u2.pressButton();
		u3.pressButton();
	}
	
	public void pressButton() {
		count++;
		System.out.println("���� ���� ��ȣ�� "+count+"��° �Դϴ�.");
	}
}
