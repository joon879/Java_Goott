package com.tech.w01list;

import java.util.HashSet;
import java.util.Set;

public class FindSetTest2 {
	public static void main(String[] args) {
		
		//어떤 데이터가 중복되는지 출력해보기!!
		
		
		Set<String> s = new HashSet<String>(); //set: 집합.
		String[] sample = {"Butter", "Apple", "Orange", "Butter", "Apple"};
		System.out.println(s);
		
		//sample의 데이터를 s에 추가
		for (String ele : sample) {
			//데이터가 중복되면 코드로 변형.
			if (!s.add(ele)) {
				//중복되어 있으면!의 조건이다. 아래의 조건블록으로 이동
				//if의 조건문(괄호안)의 내용은 true가 디폴트.
				//Set은 이미 들어있는(중복) 데이터이면 false를 반환한다.
				//(!s.add(ele))과
				//(s.add(ele) == false)는 동일한 내용이다.
	
				System.out.println("중복데이터: "+ele);
			}
		}
		
		//set은 중복 비허용.
		System.out.println(s);
	}
}
