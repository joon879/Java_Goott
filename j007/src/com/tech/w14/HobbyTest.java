package com.tech.w14;

public class HobbyTest {
	public static void main(String[] args) {
//		취미 취미1 취미2 취미3
//		누구의 취미: 취미출력
//		출력은 Hobby에서 리턴
//		생성자를 통해서 취미전달
		
//		Hobby hb = new Hobby("김자바", "축구", "야구", "농구");
		Hobby hb = new Hobby();
		
		//setter를 활용한 데이터 전달
		hb.setName("흥놀부");
		hb.setHob1("농구");
		hb.setHob2("바둑");
		hb.setHob3("고무줄");
		
		System.out.println(hb.getName()+"의 취미는 "+hb.getHob1()+
				", "+hb.getHob2()+
				", "+hb.getHob3());
	}
}
