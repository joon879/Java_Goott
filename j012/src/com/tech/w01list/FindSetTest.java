package com.tech.w01list;

import java.util.HashSet;
import java.util.Set;

public class FindSetTest {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>(); //set: ����.
		String[] sample = {"Butter", "Apple", "Orange", "Butter"};
		System.out.println(s);
		
		//sample�� �����͸� s�� �߰�
		for (String ele : sample) {
			s.add(ele);
			System.out.println(ele);
		}
		
		//set�� �ߺ� �����.
		System.out.println(s);
	}
}
