package com.tech.mission;

import java.util.Random;
import java.util.Scanner;

public class GBBGame {
	public static void main(String[] args) {
		/*
		 ���: ��: ����, ����: ����, ������
		 ���� 1, ���� 2, �� 3
		 ��ǻ�ʹ� ����.
		 �� ���� �Է¹ޱ� Scanner, Random
		 */
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		
		System.out.println("GBB Game Start!!");
		System.out.println("================");
		System.out.println("����ڴ� 1(����), 2(����), 3(��) �� �ϳ��� �Է��ϼ���.");
		System.out.println("================");
		
		int user = scan.nextInt();
		int com = ran.nextInt(3)+1;
		
		String user_result ="";
		
		
		if(user==1) {
			user_result = "����";
		}else if(user==2) {
			user_result = "����";
		}else {
			user_result = "��";
		}
		
		String com_result ="";
		if(com==1) {
			com_result = "����";
		}else if(com==2) {
			com_result = "����";
		}else {
			com_result = "��";
		}
		
		System.out.println("�����: "+user_result);
		System.out.println("��ǻ��: "+com_result);
		
		
		if(user==1) {
			if(com==1) {
				System.out.println("�����ϴ�");
			}else if(com==2) {
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			}else {
				System.out.println("����ڰ� �̰���ϴ�.");
			}
		}else if(user==2) {
			if(com==1) {
				System.out.println("����ڰ� �̰���ϴ�");
			}else if(com==2) {
				System.out.println("�����ϴ�.");
			}else {
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			}
		}else {
			if(com==1) {
				System.out.println("��ǻ�Ͱ� �̰���ϴ�");
			}else if(com==2) {
				System.out.println("����ڰ� �̰���ϴ�.");
			}else {
				System.out.println("�����ϴ�.");
			}
		}		
	}
}
