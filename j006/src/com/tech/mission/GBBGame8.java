package com.tech.mission;

import java.util.Random;
import java.util.Scanner;

public class GBBGame8 {
	//final ���Ȱ��, ���ڸ�����ȭ
	static final int GAWI=1;
	static final int BAWI=2;
	static final int BO=3;
	static String str1,str2;
	static int yNum;//����
	static int cNum;//��
	static Scanner sc;
	static Random ra;//**
	public static void main(String[] args) {
//		���� ���� ���� �ν��� ���ϰ�
		ra=new Random();
		sc=new Scanner(System.in);
		GBBGame8 g3=new GBBGame8();
//		int cNum=0;//��
//		int yNum=0;//����
//		���� 1, ���� 2, �� 3 
		System.out.println("���� ��������������");
		System.out.println("���� 1, ���� 2, �� 3 ");
		//�������� �Է�
		System.out.println("���� �� ����(���� 1, ���� 2, �� 3)");
		yNum=sc.nextInt();
		g3.goAction(yNum,1);
		System.out.println("yNum:"+str1);
		cNum=ra.nextInt(3)+1;
		g3.goAction(cNum,2);
		System.out.println("cNum:"+str2);

		if (!(yNum==1 || yNum==2 || yNum==3)) {//�������Է�
			g3.reType();
		}else {
			g3.judge(cNum, yNum);	
		}
			
	}
	public void reType() {
		GBBGame8 g3=new GBBGame8();
		System.out.println("�ٽ��Է�:");
		yNum=sc.nextInt();
		g3.goAction(yNum,1);//**
		cNum=ra.nextInt(3)+1;
		g3.goAction(cNum,2);//**
		System.out.println("yNum:"+str1);
		System.out.println("cNum:"+str2);
		if (!(yNum==1 || yNum==2 || yNum==3)) {//�������Է�
			g3.reType();
		}else {
			g3.judge(cNum, yNum);	
		}	
	}
	public void goAction(int Num,int type) {
		if (type==1) {
			if (Num==GAWI) {
				str1="����";
			}else if (Num==BAWI) {
				str1="����";
			}else if (Num==BO){
				str1="��";
			}else {
				str1="�ٽ�";
			}
		}else if (type==2) {
			if (Num==GAWI) {
				str2="����";
			}else if (Num==BAWI) {
				str2="����";
			}else{
				str2="��";
			}
		}
	}
	public void judge(int cNum, int yNum) {
		//����
				if ((cNum==GAWI && yNum==BO) ||
						(cNum==BAWI && yNum==GAWI) ||
						(cNum==BO && yNum==BAWI)) {
					System.out.println("�Ľ¸�");
				}else if ((yNum==GAWI && cNum==BO) || 
						(yNum==BAWI && cNum==GAWI) ||
						(yNum==BO && cNum==BAWI)) {
					System.out.println("�����¸�");
				}else {
					System.out.println("���º�");
				}
				
	}
}
