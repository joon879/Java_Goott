package com.tech.w10;

import java.util.Scanner;

public class ItemTrans {
//	private int point;
	private int total;
	
	public int[] getItem() {
		Scanner scan = new Scanner(System.in);
		int[] arrPoint = new int[3];
		
		for (int i = 0; i < arrPoint.length; i++) {
			System.out.println("��ų�� �Է��ϼ���.");
			String skill = scan.next();
					
			if(skill.equals("����")) {
				arrPoint[0] = 1000;
				total += arrPoint[0];
			} else if(skill.equals("��������")) {
				arrPoint[1] = 3000;
				total += arrPoint[1];
			} else if(skill.equals("����ų")) {
				arrPoint[2] = 5000;
				total += arrPoint[2];
			}
		}
		System.out.println("�迭 point ���Ϥ���");
		return arrPoint;
		
	}



	public int getTotal() {
		return total;
	}



	
}
