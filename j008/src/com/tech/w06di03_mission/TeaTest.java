package com.tech.w06di03_mission;

public class TeaTest {
	public static void main(String[] args) {
		
//		BlackTea bt = new BlackTea();
//		GreenTea gt = new GreenTea();
//		YuzaTea yt = new YuzaTea();
		//이렇게 해도 된다. but 아래가 더 직관적이다?
		
		KoreanTea bt = new BlackTea();
		KoreanTea gt = new GreenTea();
		KoreanTea yt = new YuzaTea();
		
//		Tea tea = new Tea(new BlackTea());
		Tea tea = new Tea(yt);
		tea.teaType();
	}
}
