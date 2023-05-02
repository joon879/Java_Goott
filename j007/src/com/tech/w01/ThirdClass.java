package com.tech.w01;

public class ThirdClass {
	public static void main(String[] args) {
		
		SecondClass sc = new SecondClass();
		sc.print();
		//print()라는 메서드를 호출하면 자신의 클래스부터 시작해서
		//부모 클래스까지 해당 메서드가 있는지 찾아간다.
	}
}
