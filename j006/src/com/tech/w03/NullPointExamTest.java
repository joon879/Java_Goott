package com.tech.w03;

public class NullPointExamTest {
	public static void main(String[] args) {
		NullPointExam nexample = new NullPointExam();
		nexample.getData(1000);
		
		System.out.println("'\n �ؽ��ڵ�: "+nexample);
		nexample = null;
		System.out.println("'\n �ؽ��ڵ�: "+nexample);
		nexample.getData(1000);
	}
}
