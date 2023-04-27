package com.tech.w01;

public class MethodExam2 {
	public static void main(String[] args) {
		//자신의 클래스를 객체로 만들기
		MethodExam2 m1 = new MethodExam2(); //m1이라는 객체 생성.
		
		//호출
		m1.makeSum(); //객체 생성 후 호출.

		
		
	}
	//makeSum
	//static 안 붙은 함수: 객체(m1)를 생성해야 (.)으로 호출 가능.
	public void makeSum() {
		int sum = 0;
		int start = 50;
		int end = 100;
		for (int i = start; i < end; i++) {
			sum += i;
		}
		System.out.println("start: "+start);
		System.out.println("end: "+end);
		System.out.println("sum: "+sum);
	}

//	//static붙은 함수: 처음부터 메모리에 올려둔다. 함수 호출 시 객체 필요 없다.
//	private static void makeSum() {
//		System.out.println("makeSum !!");
//		
//	}
	

}
