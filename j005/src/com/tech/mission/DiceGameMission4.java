package com.tech.mission;

import java.util.Random;
import java.util.Scanner;

public class DiceGameMission4 {
	public static void main(String[] args) {
		/*
		 ÁÖ»çÀ§ °ÔÀÓ
		 ·£´ý ÁÖ»çÀ§ ¹Þ±â
		 kim, ÄÄÇ»ÅÍ
		 Å« ¼ö¸¦ ¹Þ´Â »ç¶÷ÀÌ ½Â¸®
		 ÆÇÁ¤.
		 °á°ú: ±è¾¾´Â 3, ÄÄÇ»ÅÍ´Â 5 -> ÄÄÇ»ÅÍ ½Â¸®
		 */
		
		//Random »ç¿ëÇÏ±â
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		System.out.println("Hi Start Dice Game!!");
		System.out.println("±è¾¾ÀÇ ÁÖ»çÀ§ ±¼¸®±â Enter!");
		//Àá½Ã¸ØÃã
		System.out.println(scan.nextLine());
		int userNum = r.nextInt(6)+1; //6: 0~5±îÁö
		System.out.println(userNum);
		
		System.out.println("ÄÄÇ»ÅÍÀÇ ÁÖ»çÀ§ ±¼¸®±â Enter!");
		//Àá½Ã¸ØÃã
		System.out.println(scan.nextLine());
		int comNum = r.nextInt(6)+1;
		System.out.println(comNum);
		
		
		
		String result = "";
		
		if(userNum > comNum) {
			result = "±è¾¾°¡ ½Â¸®Çß½À´Ï´Ù.";
		}else if(userNum < comNum) {
			result = "ÄÄÇ»ÅÍ°¡ ½Â¸®Çß½À´Ï´Ù.";
		}else {
			result = "±è¾¾¿Í ÄÄÇ»ÅÍ°¡ ºñ°å½À´Ï´Ù.";
		}	
		
		System.out.println("±è¾¾ÀÇ ÁÖ»çÀ§: "+userNum);
		System.out.println("ÄÄÇ»ÅÍÀÇ ÁÖ»çÀ§: "+comNum);
		System.out.println(result);
					
	}
}
