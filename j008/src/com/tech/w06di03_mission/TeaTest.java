package com.tech.w06di03_mission;

public class TeaTest {
	public static void main(String[] args) {
		KoreanTea bt = new BlackTea();
		KoreanTea gt = new GreenTea();
		KoreanTea yt = new YuzaTea();
		
//		Tea tea = new Tea(new BlackTea());
		Tea tea = new Tea(yt);
		tea.teaType();
	}
}
