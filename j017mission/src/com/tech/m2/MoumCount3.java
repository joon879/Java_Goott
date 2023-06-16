package com.tech.m2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class MoumCount3 {
	public static void main(String[] args) {
		
		System.out.println("영어단어를 입력하세요.");		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(str);
		
		//정규식 사용
		Pattern pattern = Pattern.compile("[aeiouAEIOU]");
		Matcher matcher = pattern.matcher(str);
		
		int cnt = 0;
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
		
		System.out.println("모음의 갯수는: "+cnt);
	}
}

