package com.tech.w11;

public class Calculator2 {
	public static void main(String[] args) {
//		Calculator2 cal = new Calculator2();
//		��ü ���� ���� static �޼���� �ٷ� ȣ��.
		
		double returnVal1 = add(7,5);
		System.out.println("���: "+returnVal1);
		
		double returnVal2 = sub(7,5);
		System.out.println("���: "+returnVal2);
		
		double returnVal3 = multi(7,5);
		System.out.println("���: "+returnVal3);
		
		double returnVal4 = div(7,5);
		System.out.println("���: "+returnVal4);
		
		
	}
	
	public static double add(double x, double y) {
		return x+y;
	}
	
	public static double sub(double x, double y) {
		return x-y;
	}
	
	public static double multi(double x, double y) {
		return x*y;
	}
	
	public static double div(double x, double y) {
		return x/y;
	}
}
