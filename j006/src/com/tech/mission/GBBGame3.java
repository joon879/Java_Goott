package com.tech.mission;

import java.util.Random;
import java.util.Scanner;

public class GBBGame3 {
	public static void main(String[] args) {

		Random ra = new Random();
		Scanner sc = new Scanner(System.in);
		int cNum = 0;
		int yNum = 0;
		
		System.out.println("�������������� ����");
		System.out.println("���� 1, ���� 2, �� 3");
		System.out.println("���� ���� �Է�");
		yNum = sc.nextInt();
		cNum = ra.nextInt(3)+1;
		System.out.println("����: "+yNum);
		System.out.println("��ǻ��: "+cNum);
		
		GBBGame3 g3 = new GBBGame3();
		g3.judge(cNum, yNum);
				
	}
	
	public void judge(int cNum, int yNum) {
		if ((cNum==1 && yNum==3) || 
				(cNum==2 && yNum==1) || 
				(cNum==3 && yNum==2)) {
			System.out.println("��ǻ�� �¸�");
		}else if ((yNum==1 && cNum==3) || 
				(yNum==2 && cNum==1) || 
				(yNum==3 && cNum==2)) {
			System.out.println("���� �¸�");
		}else {
			System.out.println("���º�");
		}
	}
}
