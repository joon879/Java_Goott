package com.tech.w04inter3;

public class PhoneCall extends Phone implements VisualCall, VoiceCall{

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
