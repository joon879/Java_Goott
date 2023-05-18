package com.tech.w02setmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {
	public static void main(String[] args) {
		
		//Map은 키와 밸류로 구성됨.
		Map<String, String> m = new HashMap<String, String>();
		
		//키와 밸류 입력
		m.put("q1", "ans1");
		m.put("q2", "ans2");
		m.put("q3", "ans3");
		m.put("q4", "ans3");
		//키는 중복 불가, 밸류는 중복 가능.
		
		System.out.println(m);
		
		//데이터 하나 가져오기
		System.out.println(m.get("q1"));
		System.out.println(m.get("ans1")); // ????
		
		//키, 밸류 동시에 가져오기
		for (Entry<String, String> e : m.entrySet()) {
			String key = e.getKey();
			String value = e.getValue();
			System.out.println(key+" / "+value);
		}
	}
}
