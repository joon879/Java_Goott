package com.tech.w06di03_mission;

public class TeaTest {
	public static void main(String[] args) {
		
//		BlackTea bt = new BlackTea();
//		GreenTea gt = new GreenTea();
//		YuzaTea yt = new YuzaTea();
		//�̷��� �ص� �ȴ�. but �Ʒ��� �� �������̴�?
		
		KoreanTea bt = new BlackTea();
		KoreanTea gt = new GreenTea();
		KoreanTea yt = new YuzaTea();
		
//		Tea tea = new Tea(new BlackTea());
		Tea tea = new Tea(yt);
		tea.teaType();
	}
}
