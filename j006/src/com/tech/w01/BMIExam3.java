package com.tech.w01;

import java.util.Scanner;

public class BMIExam3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BMIExam3 m = new BMIExam3();
		
		System.out.println("Ű�� �Է��ϼ���.(����)");
		float h = scan.nextFloat();
		System.out.println("�����Ը� �Է��ϼ���.(ų�α׷�)");
		float w = scan.nextFloat();
		
		float index = m.calculate(h,w);
		System.out.println(index);
		//ü���� ������ �񸸵� ����
		String message = m.getResult(index);
		System.out.println("����: "+message);
		
	}
	
	public float calculate(float h, float w) {
		float hmulti = h*h;
		float index = w/hmulti;
		return index;
		
	}
	
	public String getResult(float index) {
		String msg;
		if(index>=25) {
			msg = "��";
		}else if(index>=23) {
			msg = "��ü��";
		}else if(index>=18.5) {
			msg = "����";
		}else {
			msg = "��ü��";
		}
		return msg;
	}
}
