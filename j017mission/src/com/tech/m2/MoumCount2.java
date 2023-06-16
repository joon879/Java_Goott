package com.tech.m2;

import java.util.Scanner;

public class MoumCount2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("영어단어를 입력하세요.");		
		String str = scan.nextLine();
		
		
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case 'a': 
			case 'e': 
			case 'i': 
			case 'o': 
			case 'u': cnt++; break;
			case 'A': 
			case 'E': 
			case 'I': 
			case 'O': 
			case 'U': cnt++; break;
			
			default:
				break;
			}
		}
		
		System.out.println("모음의 갯수는: "+cnt);
	}
}

