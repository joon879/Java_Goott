package com.tech.w04inter4toclass;

public class PhoneCall extends VisualCall implements VoiceCall{

	@Override
	public void sendVoiceMsg() {
		System.out.println("�����޽��� ����");
		
	}

	@Override
	public void getVoiceMsg() {
		System.out.println("�����޽��� ����");
		
	}

	@Override
	public void sendVisualMsg() {
		System.out.println("����޽��� ����");
		
	}

	@Override
	public void getVisualMsg() {
		System.out.println("����޽��� ����");
		
	}

}
