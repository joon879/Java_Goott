package com.tech.w01;

public class BMIExam2 {
	public static void main(String[] args) {
		BMIExam1 m = new BMIExam1();
		float h = 1.8f;
		float w = 75f;
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
