package com.tech.w05;

public class IfSeason5 {
	public static void main(String[] args) {
		//�� ���� ���� �ܿ��� switch�� if�� ����
		int season = (int)(Math.random()*12)+1;
		System.out.println(season);
		
		
		if(season==1 | season==2 | season==11 | season==12) {
			System.out.println("�ܿ�");
		}else if(season>=3 & season<=4) {
			System.out.println("��");
		}else if(season>=5  & season<=8) {
			System.out.println("��");
		}else if(season==9 | season==10) {
			System.out.println("����");
		}
	}
}
