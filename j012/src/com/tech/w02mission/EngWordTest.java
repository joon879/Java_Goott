package com.tech.w02mission;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EngWordTest {

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

		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("영어단어를 입력해주세요.");
			String eng = scan.nextLine();
			
			if (words.containsKey(eng)) {
				String kor = words.get(eng);
				System.out.println(eng + "의 의미는 " + kor + "입니다.");
				System.out.println("==========================");
			}
			else {
				System.out.println("Please enter again.");
				System.out.println("==========================");
			}
						
		}
		
//		while (true) {
//			Scanner scan = new Scanner(System.in);
//			System.out.println("영어단어를 입력해주세요.");
//			String eng = scan.nextLine();
//			
//			if (words.get(eng) != null) {
//				String kor = words.get(eng);
//				System.out.println(eng + "의 의미는 " + kor + "입니다.");
//				System.out.println("==========================");
//			}
//			else {
//				System.out.println("Please enter again.");
//				System.out.println("==========================");
//			}
//						
//		}

	}

}
