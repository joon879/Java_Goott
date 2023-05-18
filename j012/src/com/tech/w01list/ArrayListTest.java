package com.tech.w01list;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		//List는 배열처럼 사이즈를 미리 정하지 않는다.
		list.add("Milk");
		list.add("Milk2");
		list.add("Butter");
		list.add("Apple");
		list.add("Grape");
		list.add("Bread");
		
		//출력
		for (String val : list) {
			System.out.println(val);
		}
		System.out.println("-----------------------");
		
		//삭제 by index
		list.remove(2);		
		for (String val : list) {
			System.out.println(val);
		}
		System.out.println("-----------------------");
		
		//삭제 by value
		list.remove("Apple");		
		for (String val : list) {
			System.out.println(val);
		}
		System.out.println("-----------------------");
		
		//추가(마지막에 추가됨)
		list.add("Apple");		
		for (String val : list) {
			System.out.println(val);
		}
		System.out.println("-----------------------");
		
		//위치지정 추가
		list.add(1, "Bread2");		
		for (String val : list) {
			System.out.println(val);
		}
		System.out.println("-----------------------");
		
		//리스트는 .size()로!! / 배열은 .length()
		System.out.println("길이출력: "+list.size());
		System.out.println("검색: "+list.get(1));
		System.out.println("Milk2의 인덱스넘버: "+list.indexOf("Milk2"));
	}
}
