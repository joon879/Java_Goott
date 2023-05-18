package com.tech.w01list;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
	
	//반복자
	//ArrayList에서 원소에 접근하여 요소를 가져오는 역할
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("하나1");
		list.add("하나2");
		list.add("하나3");
		list.add("하나4");
		list.add("하나5");
		list.add("하나6");
		
		
//		for (String ele : list) {
//			System.out.println(ele);
//		}
		
		
		//반복자 사용
		String s;
		Iterator e = list.iterator(); //리스트에 반복자 구성
		while (e.hasNext()) {
			s = (String) e.next();
			System.out.println(s);
		}
	}
}
