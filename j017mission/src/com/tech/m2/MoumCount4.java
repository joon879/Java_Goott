package com.tech.m2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class MoumCount4 {
	public static void main(String[] args) {
		
		System.out.println("영어단어를 입력하세요.");		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(str);
		
		//정규식 사용2
		int cnt = 0;
		int i = 0;
		while (i<str.length()) {
			if(String.valueOf(str.charAt(i)).matches("[aeiouAEIOU]+")) {
				cnt++;
			}
			i++;
		}
		
		System.out.println("모음의 갯수는: "+cnt);
	}
}

