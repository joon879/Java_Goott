package com.tech.w02setmap;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSortTest {

	public static void main(String[] args) {
		String[] sample = {"a", "b", "d", "c"};
		List<String> list = Arrays.asList(sample); //배열을 리스트로 변환
		//리스트안에 샘플 데이터가 존재하도록.
		System.out.println(list);
		
		Collections.reverse(list); // -> 단순 순서 뒤바꾸기.
		System.out.println(list);
		
		//오름차순 정렬
		Collections.sort(list);
//		Collections.sort(sample); -> 이건 오류난다.
		System.out.println(list);
		
		//내림차순
		Collections.sort(list, Collections.reverseOrder()); // -> ,내림차순 정렬 함수.
		System.out.println(list);
		
	}
}
