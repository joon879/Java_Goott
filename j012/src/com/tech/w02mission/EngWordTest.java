package com.tech.w02mission;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EngWordTest {

	public static void main(String[] args) {

		Map<String, String> words = new HashMap<String, String>();

		words.put("culture", "��ȭ");
		words.put("experience", "����");
		words.put("education", "����");
		words.put("symbol", "��¡");
		words.put("effect", "����");
		words.put("liberty", "����");
		words.put("affair", "���");
		words.put("comfort", "�ȶ�");
		words.put("tradition", "����");
		words.put("subject", "�а�");

		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("����ܾ �Է����ּ���.");
			String eng = scan.nextLine();
			
			if (words.containsKey(eng)) {
				String kor = words.get(eng);
				System.out.println(eng + "�� �ǹ̴� " + kor + "�Դϴ�.");
				System.out.println("==========================");
			}
			else {
				System.out.println("Please enter again.");
				System.out.println("==========================");
			}
						
		}
		
//		while (true) {
//			Scanner scan = new Scanner(System.in);
//			System.out.println("����ܾ �Է����ּ���.");
//			String eng = scan.nextLine();
//			
//			if (words.get(eng) != null) {
//				String kor = words.get(eng);
//				System.out.println(eng + "�� �ǹ̴� " + kor + "�Դϴ�.");
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
