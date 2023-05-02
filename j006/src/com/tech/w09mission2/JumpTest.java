package com.tech.w09mission2;

public class JumpTest {
	public static void main(String[] args) {
//		getItem이라는 메소드를 만들어
//		점프(하면) -- 1000 증가
//		더블점프 -- 3000
//		적군 킬 -- 5000
//		
//		메인에서 결과값 출력
//		포인트: 1000
//		포인트: 3000
//		포인트: 5000
		
		ItemTrans it = new ItemTrans();
		it.getItem("점프");
		System.out.println("포인트 "+it.getPoint()+" 획득.");
//		System.out.println("누적 포인트: "+it.getTotal());
		
		it.getItem("더블점프");
		System.out.println("포인트 "+it.getPoint()+" 획득.");
//		System.out.println("누적 포인트: "+it.getTotal());
		
		it.getItem("킬");
		System.out.println("포인트 "+it.getPoint()+" 획득.");
		System.out.println("누적 포인트: "+it.getTotal());
		
		
	}
}
