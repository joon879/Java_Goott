package com.tech.mission;

import java.util.Random;
import java.util.Scanner;

public class DiceGameMission4 {
	public static void main(String[] args) {
		/*
		 �ֻ��� ����
		 ���� �ֻ��� �ޱ�
		 kim, ��ǻ��
		 ū ���� �޴� ����� �¸�
		 ����.
		 ���: �达�� 3, ��ǻ�ʹ� 5 -> ��ǻ�� �¸�
		 */
		
		//Random ����ϱ�
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		System.out.println("Hi Start Dice Game!!");
		System.out.println("�达�� �ֻ��� ������ Enter!");
		//��ø���
		System.out.println(scan.nextLine());
		int userNum = r.nextInt(6)+1; //6: 0~5����
		System.out.println(userNum);
		
		System.out.println("��ǻ���� �ֻ��� ������ Enter!");
		//��ø���
		System.out.println(scan.nextLine());
		int comNum = r.nextInt(6)+1;
		System.out.println(comNum);
		
		
		
		String result = "";
		
		if(userNum > comNum) {
			result = "�达�� �¸��߽��ϴ�.";
		}else if(userNum < comNum) {
			result = "��ǻ�Ͱ� �¸��߽��ϴ�.";
		}else {
			result = "�达�� ��ǻ�Ͱ� �����ϴ�.";
		}	
		
		System.out.println("�达�� �ֻ���: "+userNum);
		System.out.println("��ǻ���� �ֻ���: "+comNum);
		System.out.println(result);
					
	}
}
