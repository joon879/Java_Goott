package com.tech.w06;

public class ForFloatExam {
	public static void main(String[] args) {
//		for (float x = 0.1f; x < 1.0f; x=x+0.1f) {
//			System.out.println("print: "+x);
//		}
		
		//printf
		for (float x = 0.1f; x < 1.0f; x=x+0.1f) {
			System.out.printf("print: %.2f \n",x); //.2: �Ҽ��� ��°�ڸ����� ǥ���϶�. x�� %�� �����϶�.
		}
		
		//printf2
		for (float x = 0.1f; x < 1.0f; x=x+0.1f) {
			System.out.printf("print: %5.2f \n",x);
		}
		
		int num = 100;
		float score = 100.0f;
		String str = "����";
		char ch = '��';
		
		//printf��� ���
		System.out.printf("num: %d \n", num);
		System.out.printf("num: %f \n", score);
		System.out.printf("num: %s \n", str);
		System.out.printf("c: %c \n", ch);
		
		System.out.printf("��Ʈ�� %s�� �ִ� %d%% %c %.1f%% \n", str, num, ch, score);
		//%�� ����ϰ� ���� �� %�� �� �� �Է��Ѵ�!!
		
	}
}
