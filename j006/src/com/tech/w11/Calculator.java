package com.tech.w11;

public class Calculator {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		double returnVal1 = cal.add(7,5);
		System.out.println("���: "+returnVal1);
		
		double returnVal2 = cal.sub(7,5);
		System.out.println("���: "+returnVal2);
		
		double returnVal3 = cal.multi(7,5);
		System.out.println("���: "+returnVal3);
		
		double returnVal4 = cal.div(7,5);
		System.out.println("���: "+returnVal4);
		
		
	}
	
	public double add(double x, double y) {
		return x+y;
	}
	
	public double sub(double x, double y) {
		return x-y;
	}
	
	public double multi(double x, double y) {
		return x*y;
	}
	
	public double div(double x, double y) {
		return x/y;
	}
}
