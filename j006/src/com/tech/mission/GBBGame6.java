package com.tech.mission;

import java.util.Random;
import java.util.Scanner;

public class GBBGame6 {
//	final ���Ȱ��, ���ڸ� ����ȭ
	static final int GAWI = 1;
	static final int BAWI = 2;
	static final int BO = 3;
	static String str;
	
	public static void main(String[] args) {
//		���� ���� ���� �ν��� ���ϰ�
		Random ra = new Random();
		Scanner sc = new Scanner(System.in);
		GBBGame6 g3 = new GBBGame6();
		int cNum = 0;
		int yNum = 0;
		
		System.out.println("�������������� ����");
		System.out.println("���� 1, ���� 2, �� 3");
		System.out.println("���� ���� �Է�");
		yNum = sc.nextInt();
		//
		g3.goAction(yNum);
		System.out.println("����: "+str);
		
		cNum = ra.nextInt(3)+1;
		//
		g3.goAction(cNum);
		System.out.println("��ǻ��: "+str);
		g3.judge(cNum, yNum);
				
	}
	
	public void goAction(int Num) {
		if(Num==GAWI) {
			str = "����";
		}else if(Num==BAWI) {
			str = "����";
		}else {
			str = "��";
		}
	}
	
	
	public void judge(int cNum, int yNum) {
		if ((cNum==GAWI && yNum==BO) || 
				(cNum==BAWI && yNum==GAWI) || 
				(cNum==BO && yNum==BAWI)) {
			System.out.println("��ǻ�� �¸�");
		}else if ((yNum==GAWI && cNum==BO) || 
				(yNum==BAWI && cNum==GAWI) || 
				(yNum==BO && cNum==BAWI)) {
			System.out.println("���� �¸�");
		}else {
			System.out.println("���º�");
		}
	}
}
