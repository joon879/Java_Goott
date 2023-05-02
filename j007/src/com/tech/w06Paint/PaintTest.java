package com.tech.w06Paint;

import java.util.Scanner;

public class PaintTest {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		OilPaint op = new OilPaint();
		OrientPaint orp = new OrientPaint();
		WaterPaint wp = new WaterPaint();
		
		
//		System.out.println("출품할 그림을 선택하세요.");
//		System.out.println("1. 유화, 2. 동양화, 3. 수채화");
		
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
