package com.tech.w03;

import java.util.Calendar;
import java.util.Date;

public class IfGoodmorning {
	public static void main(String[] args) {
		// 객체생성
//		Date date = new Date();
//		int currHour = date.getHours();
//		System.out.println(currHour);
//		// 12보다 작으면 Good mornig
//		// 12보다 크면 Good evening
//		
//		if(currHour < 12) {
//			System.out.println("Good morning");
//		} else if(currHour > 12) {
//			System.out.println("Good evening");
//		} 이걸 사용하지 마라.
		
		Calendar calendar = Calendar.getInstance();
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		
		System.out.println(hour);
		if(hour > 12) {
			System.out.println("Good evening");
		} else if(hour < 12) {
			System.out.println("Good morning");
		}
	}
}
