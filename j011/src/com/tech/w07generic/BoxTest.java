package com.tech.w07generic;

public class BoxTest {
	public static void main(String[] args) {
		Box bx = new Box();
//		bx.setData(100);
		bx.setData("100¿ø");
		
		
//		int cnt = (int) bx.getData();
//		System.out.println(cnt);
		
		String cnt = (String) bx.getData();
		System.out.println(cnt);
	}
}
