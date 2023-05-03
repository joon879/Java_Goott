package com.tech.w11;

public class SchoolTest extends School{
	public static void main(String[] args) {
		SchoolTest ss = new SchoolTest();
		ss.doStudy();
		ss.superCall();
		
	}

	
	public void doStudy() {
		System.out.println("자식 등교시간 조정");
		
	}
	public void superCall() {
		System.out.println("this call");
		super.doStudy();
		this.doStudy();
	}
}
