package com.tech.m2;

import java.util.Scanner;

public class MoumCount {
	public static void main(String[] args) {
		
		System.out.println("영어단어를 입력하세요.");		
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
					System.out.println("모음: "+moum[j]);
					cnt++;
				}
			}		
		}
		System.out.println("모음의 갯수는: "+cnt);
	}
}

