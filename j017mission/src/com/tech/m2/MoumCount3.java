package com.tech.m2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class MoumCount3 {
	public static void main(String[] args) {
		
		System.out.println("����ܾ �Է��ϼ���.");		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(str);
		
		//���Խ� ���
		Pattern pattern = Pattern.compile("[aeiouAEIOU]");
		Matcher matcher = pattern.matcher(str);
		
		int cnt = 0;
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
		
		System.out.println("������ ������: "+cnt);
	}
}

