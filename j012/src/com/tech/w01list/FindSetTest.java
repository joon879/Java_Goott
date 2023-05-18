package com.tech.w01list;

import java.util.HashSet;
import java.util.Set;

public class FindSetTest {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>(); //set: 집합.
		String[] sample = {"Butter", "Apple", "Orange", "Butter"};
		System.out.println(s);
		
		//sample의 데이터를 s에 추가
		for (String ele : sample) {
			s.add(ele);
			System.out.println(ele);
		}
		
		//set은 중복 비허용.
		System.out.println(s);
	}
}
