package com.tech.w02setmap;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSortTest {

	public static void main(String[] args) {
		String[] sample = {"a", "b", "d", "c"};
		List<String> list = Arrays.asList(sample); //�迭�� ����Ʈ�� ��ȯ
		//����Ʈ�ȿ� ���� �����Ͱ� �����ϵ���.
		System.out.println(list);
		
		Collections.reverse(list); // -> �ܼ� ���� �ڹٲٱ�.
		System.out.println(list);
		
		//�������� ����
		Collections.sort(list);
//		Collections.sort(sample); -> �̰� ��������.
		System.out.println(list);
		
		//��������
		Collections.sort(list, Collections.reverseOrder()); // -> ,�������� ���� �Լ�.
		System.out.println(list);
		
	}
}
