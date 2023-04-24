package com.tech.w01;

import java.util.ArrayList;

public class TypeExam {
	public static void main(String[] args) {
		String str = "ABC";
		Integer i = 123;
		ArrayList<String> list = new ArrayList<String>();
		
		System.out.println("String: "+str.getClass().getName());
		System.out.println("Integer: "+i.getClass().getName());
		System.out.println("List: "+list.getClass().getName());
	}
}
