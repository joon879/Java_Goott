package com.tech.w06di03_mission;

public class Tea {
//	private BlackTea t;
	private KoreanTea t;
	
	public Tea(KoreanTea t) {
//		t = new BlackTea();
		
		this.t = t;
		System.out.println("생성자 호출");
		
	}
	
	public void teaType() {
		System.out.println(t.getName());
	}
}
