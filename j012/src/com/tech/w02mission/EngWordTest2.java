package com.tech.w02mission;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EngWordTest2 {

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

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("����ܾ� �Է�");
			String key = sc.next();
			if(key.equals("q")) {
				System.out.println("�˻�����");
				break;
			}
			if(words.get(key)==null) {
				System.out.println("Please enter again.");
			}
			else {
				System.out.println(key+"�� �ǹ̴�: "+words.get(key));
			}
		} while (true);

		
	}

}
