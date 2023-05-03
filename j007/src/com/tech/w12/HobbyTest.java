package com.tech.w12;

public class HobbyTest {
	public static void main(String[] args) {
//		취미 취미1 취미2 취미3
//		누구의 취미: 취미출력
//		출력은 Hobby에서 리턴
//		생성자를 통해서 취미전달
		
		Hobby hb = new Hobby("김자바", "축구", "야구", "농구");
		
		System.out.println(hb.getName()+"의 취미는 "+hb.getHobby1()+"\s"+hb.getHobby2()+"\s"+hb.getHobby3());
		
		
		
		System.out.println("TESTTESTETSET \s그러면 이건");
		
	}
}
