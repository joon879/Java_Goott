package com.tech.m2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class MoumCount4 {
	public static void main(String[] args) {
		
		System.out.println("����ܾ �Է��ϼ���.");		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(str);
		
		//���Խ� ���2
		int cnt = 0;
		int i = 0;
		while (i<str.length()) {
			if(String.valueOf(str.charAt(i)).matches("[aeiouAEIOU]+")) {
				cnt++;
			}
			i++;
		}
		
		System.out.println("������ ������: "+cnt);
	}
}

