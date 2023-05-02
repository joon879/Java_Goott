package com.tech.w10;

public class JumpTest {
	public static void main(String[] args) {
		
		
//		System.out.println("점프, 더블점프, 적군킬");
		

		ItemTrans its = new ItemTrans();
		int[] rArr = its.getItem();
		System.out.println("점프포인트: "+rArr[0]);
		System.out.println("더블점프포인트: "+rArr[1]);
		System.out.println("적군킬: "+rArr[2]);
		System.out.println("포인트토탈: "+its.getTotal());
		
		
		

	}
}
