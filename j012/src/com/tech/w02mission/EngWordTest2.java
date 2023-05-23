package com.tech.w02mission;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EngWordTest2 {

	public static void main(String[] args) {

		Map<String, String> words = new HashMap<String, String>();

		words.put("culture", "문화");
		words.put("experience", "경험");
		words.put("education", "교육");
		words.put("symbol", "상징");
		words.put("effect", "영향");
		words.put("liberty", "자유");
		words.put("affair", "사건");
		words.put("comfort", "안락");
		words.put("tradition", "전통");
		words.put("subject", "학과");

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("영어단어 입력");
			String key = sc.next();
			if(key.equals("q")) {
				System.out.println("검색종료");
				break;
			}
			if(words.get(key)==null) {
				System.out.println("Please enter again.");
			}
			else {
				System.out.println(key+"의 의미는: "+words.get(key));
			}
		} while (true);

		
	}

}
