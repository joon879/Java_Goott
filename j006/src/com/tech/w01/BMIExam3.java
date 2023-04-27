package com.tech.w01;

import java.util.Scanner;

public class BMIExam3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BMIExam3 m = new BMIExam3();
		
		System.out.println("키를 입력하세요.(미터)");
		float h = scan.nextFloat();
		System.out.println("몸무게를 입력하세요.(킬로그램)");
		float w = scan.nextFloat();
		
		float index = m.calculate(h,w);
		System.out.println(index);
		//체질량 지수로 비만도 판정
		String message = m.getResult(index);
		System.out.println("판정: "+message);
		
	}
	
	public float calculate(float h, float w) {
		float hmulti = h*h;
		float index = w/hmulti;
		return index;
		
	}
	
	public String getResult(float index) {
		String msg;
		if(index>=25) {
			msg = "비만";
		}else if(index>=23) {
			msg = "과체중";
		}else if(index>=18.5) {
			msg = "정상";
		}else {
			msg = "저체중";
		}
		return msg;
	}
}
