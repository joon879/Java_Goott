package com.tech.w11;

public class OrderUtil {
	
	//static은 공간을 객체간에 공유한다.
	private static int count;
	
	
	public static void main(String[] args) {
		OrderUtil u1 = new OrderUtil();
		OrderUtil u2 = new OrderUtil();
		OrderUtil u3 = new OrderUtil();
		
		//static이기에 변수 count가 이어서 카운트된다.
		u1.pressButton();
		u1.pressButton();
		u2.pressButton();
		u3.pressButton();
	}
	
	public void pressButton() {
		count++;
		System.out.println("고객님 접수 번호는 "+count+"번째 입니다.");
	}
}
