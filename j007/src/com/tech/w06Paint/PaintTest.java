package com.tech.w06Paint;

import java.util.Scanner;

public class PaintTest {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		OilPaint op = new OilPaint();
		OrientPaint orp = new OrientPaint();
		WaterPaint wp = new WaterPaint();
		
		
//		System.out.println("��ǰ�� �׸��� �����ϼ���.");
//		System.out.println("1. ��ȭ, 2. ����ȭ, 3. ��äȭ");
		
		op.paintBase();
		op.oilPaint();
		System.out.println();
		
		orp.paintBase();
		orp.oriPaint();
		System.out.println();
		
		wp.paintBase();
		wp.watPaint();
		
	}
}
