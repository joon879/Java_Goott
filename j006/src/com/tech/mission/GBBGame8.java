package com.tech.mission;

import java.util.Random;
import java.util.Scanner;

public class GBBGame8 {
	//final 상수활용, 숫자를문자화
	static final int GAWI=1;
	static final int BAWI=2;
	static final int BO=3;
	static String str1,str2;
	static int yNum;//영구
	static int cNum;//컴
	static Scanner sc;
	static Random ra;//**
	public static void main(String[] args) {
//		가위 바위 보의 인식을 편리하게
		ra=new Random();
		sc=new Scanner(System.in);
		GBBGame8 g3=new GBBGame8();
//		int cNum=0;//컴
//		int yNum=0;//영구
//		가위 1, 바위 2, 보 3 
		System.out.println("영구 가위바위보게임");
		System.out.println("가위 1, 바위 2, 보 3 ");
		//영구숫자 입력
		System.out.println("영구 컴 숫자(가위 1, 바위 2, 보 3)");
		yNum=sc.nextInt();
		g3.goAction(yNum,1);
		System.out.println("yNum:"+str1);
		cNum=ra.nextInt(3)+1;
		g3.goAction(cNum,2);
		System.out.println("cNum:"+str2);

		if (!(yNum==1 || yNum==2 || yNum==3)) {//비정상입력
			g3.reType();
		}else {
			g3.judge(cNum, yNum);	
		}
			
	}
	public void reType() {
		GBBGame8 g3=new GBBGame8();
		System.out.println("다시입력:");
		yNum=sc.nextInt();
		g3.goAction(yNum,1);//**
		cNum=ra.nextInt(3)+1;
		g3.goAction(cNum,2);//**
		System.out.println("yNum:"+str1);
		System.out.println("cNum:"+str2);
		if (!(yNum==1 || yNum==2 || yNum==3)) {//비정상입력
			g3.reType();
		}else {
			g3.judge(cNum, yNum);	
		}	
	}
	public void goAction(int Num,int type) {
		if (type==1) {
			if (Num==GAWI) {
				str1="가위";
			}else if (Num==BAWI) {
				str1="바위";
			}else if (Num==BO){
				str1="보";
			}else {
				str1="다시";
			}
		}else if (type==2) {
			if (Num==GAWI) {
				str2="가위";
			}else if (Num==BAWI) {
				str2="바위";
			}else{
				str2="보";
			}
		}
	}
	public void judge(int cNum, int yNum) {
		//판정
				if ((cNum==GAWI && yNum==BO) ||
						(cNum==BAWI && yNum==GAWI) ||
						(cNum==BO && yNum==BAWI)) {
					System.out.println("컴승리");
				}else if ((yNum==GAWI && cNum==BO) || 
						(yNum==BAWI && cNum==GAWI) ||
						(yNum==BO && cNum==BAWI)) {
					System.out.println("영구승리");
				}else {
					System.out.println("무승부");
				}
				
	}
}
