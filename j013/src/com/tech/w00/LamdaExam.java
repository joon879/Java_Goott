package com.tech.w00;

interface MyFunction{
	
	int calc(int x, int y);//������ �ִ� �߻�޼ҵ�.
}

public class LamdaExam {
	public static void main(String[] args) {
		
		MyFunction add = (x, y) -> {return x+y;}; //���⼭ �߻�޼ҵ� ����. �����ݷ� ��ġ ����.
		MyFunction minus = (x, y) -> {return x-y;};
		
		System.out.println(add.calc(1, 2));
		System.out.println(minus.calc(10, 5));
		
	}
}
