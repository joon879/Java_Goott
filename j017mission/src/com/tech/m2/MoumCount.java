package com.tech.m2;

import java.util.Scanner;

public class MoumCount {
	public static void main(String[] args) {
		
		System.out.println("����ܾ �Է��ϼ���.");		
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		
		String[] moum = {"a", "e", "i", "o", "u"};
		
		String[] arr_word = word.split("");
	
//		for (int i = 0; i < arr_word.length; i++) {
//			System.out.println(arr_word[i]);
//		}
		
		
		int cnt = 0;
		
		for (int i = 0; i < arr_word.length; i++) {
			for (int j = 0; j < moum.length; j++) {
				if(arr_word[i].equals(moum[j])) {
					System.out.println("����: "+moum[j]);
					cnt++;
				}
			}		
		}
		System.out.println("������ ������: "+cnt);
	}
}

