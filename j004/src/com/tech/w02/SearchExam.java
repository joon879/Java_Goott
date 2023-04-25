package com.tech.w02;

import java.util.Scanner;

public class SearchExam {
	public static void main(String[] args) {
		int[] s = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		//데이터 위치값 찾아가기
		Scanner scan = new Scanner(System.in);
		int value, index = -1;
		System.out.println("탐색할 값을 입력하세요: ");
		value = scan.nextInt();
		System.out.println(value);
		
		//배열에서 입력한 값의 위치정보를 알아내기
		//출력문장: 50은 5번째에 위치합니다.
		for (int i = 0; i < s.length; i++) {
			if(s[i]==value) {
				index = i;//i가 위치정보
				break;
			}
		}
		System.out.println(value+"은(는) "+(index+1)+"번째에 위치합니다.");
	}
}
