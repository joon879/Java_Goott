package com.tech.w10;

public class JumpTest {
	public static void main(String[] args) {
		
		
//		System.out.println("����, ��������, ����ų");
		

		ItemTrans its = new ItemTrans();
		int[] rArr = its.getItem();
		System.out.println("��������Ʈ: "+rArr[0]);
		System.out.println("������������Ʈ: "+rArr[1]);
		System.out.println("����ų: "+rArr[2]);
		System.out.println("����Ʈ��Ż: "+its.getTotal());
		
		
		

	}
}
