package com.tech.w11;

public class SchoolTest extends School{
	public static void main(String[] args) {
		SchoolTest ss = new SchoolTest();
		ss.doStudy();
		ss.superCall();
		
	}

	
	public void doStudy() {
		System.out.println("�ڽ� ��ð� ����");
		
	}
	public void superCall() {
		System.out.println("this call");
		super.doStudy();
		this.doStudy();
	}
}
