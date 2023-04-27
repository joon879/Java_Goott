package com.tech.w01;

public class MethodExam1 {
	public static void main(String[] args) {
		//자신의 클래스를 객체로 만들기
		MethodExam1 m1 = new MethodExam1(); //m1이라는 객체 생성.
		
		//호출
		m1.makeSum(); //객체 생성 후 호출.
//		makeSum(); //객체 생성 없이 호출.
		m1.hihi();
		
		
	}
	//makeSum
	//static 안 붙은 함수: 객체(m1)를 생성해야 (.)으로 호출 가능.
	public void makeSum() {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += i;
		}
		System.out.println("makeSum !!:"+sum);
	}

//	//static붙은 함수: 처음부터 메모리에 올려둔다. 함수 호출 시 객체 필요 없다.
//	private static void makeSum() {
//		System.out.println("makeSum !!");
//		
//	}
	
	public void hihi() {
		System.out.println("hi 오랜만");
	}
}
