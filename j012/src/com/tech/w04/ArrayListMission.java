package com.tech.w04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListMission {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("길동1");
		list.add("길동2");
		list.add("길동1");
		list.add("길동3");
		list.add("길동1");
		list.add("길동1");
		list.add("길동4");
		list.add("길동1");

		// remove by value
//		list.remove("길동4");

		// remove by index
//		int a = list.indexOf("길동4");
//		list.remove(a);		
		list.remove(list.indexOf("길동4"));

		
		
		
		
		
		// 길동1을 모두 제거
//		System.out.println(list.indexOf("길동6")); // 리스트에 없는 인덱스를 출력하면 <<-1>>을 리턴한다.
		while (list.indexOf("길동1") != -1) {
			list.remove("길동1");
		}
		
		//람다식을 사용하여 길동1을 모두 제거
		list.removeIf(listss -> listss.equals("길동1"));
		
		//removeall을 사용하여 길동1을 모두 제거
		list.removeAll(Arrays.asList("길동1"));
		

		for (String ele : list) {
			System.out.println(ele + " ");
		}
	}
}
