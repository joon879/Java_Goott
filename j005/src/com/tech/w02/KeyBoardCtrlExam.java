package com.tech.w02;

import java.io.IOException;

public class KeyBoardCtrlExam {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		while (run) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("--------------------");
				System.out.println("1. �ӵ�����, 2. �ӵ�����, 3. ����");
				System.out.println("--------------------");
				System.out.println("����");
			}
			keyCode = System.in.read();
			//System.out.println(keyCode);
			if(keyCode == 49) {
				speed += 100;
				System.out.println("�ӵ�����: "+speed);
			}else if(keyCode == 50) {
				speed -= 100;
				System.out.println("�ӵ�����: "+speed);
			}else if(keyCode == 51) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
}
