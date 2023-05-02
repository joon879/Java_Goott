package com.tech.w07;

public class AClassTest extends AClass{
	public static void main(String[] args) {
//		AClass a = new AClass();
		
		//private 변수 접근 불가, 다른 클래스라서.
//		System.out.println(a.pri); //private
		
		AClassTest a = new AClassTest();
		
		System.out.println(a.def); //default
		System.out.println(a.pro); //protected
		System.out.println(a.pub); //public
	}
}
