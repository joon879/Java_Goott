package com.tech.w02setmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {
	public static void main(String[] args) {
		
		//Map�� Ű�� ����� ������.
		Map<String, String> m = new HashMap<String, String>();
		
		//Ű�� ��� �Է�
		m.put("q1", "ans1");
		m.put("q2", "ans2");
		m.put("q3", "ans3");
		m.put("q4", "ans3");
		//Ű�� �ߺ� �Ұ�, ����� �ߺ� ����.
		
		System.out.println(m);
		
		//������ �ϳ� ��������
		System.out.println(m.get("q1"));
		System.out.println(m.get("ans1")); // ????
		
		//Ű, ��� ���ÿ� ��������
		for (Entry<String, String> e : m.entrySet()) {
			String key = e.getKey();
			String value = e.getValue();
			System.out.println(key+" / "+value);
		}
	}
}
