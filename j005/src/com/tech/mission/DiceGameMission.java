package com.tech.mission;

public class DiceGameMission {
	public static void main(String[] args) {
		/*
		 �ֻ��� ����
		 ���� �ֻ��� �ޱ�
		 kim, ��ǻ��
		 ū ���� �޴� ����� �¸�
		 ����.
		 ���: �达�� 3, ��ǻ�ʹ� 5 -> ��ǻ�� �¸�
		 */
		
		
		int kim = (int)(Math.random()*6) + 1;
		int com = (int)(Math.random()*6) + 1;
		String result = "";
		
		if(kim > com) {
			result = "�达�� �¸��߽��ϴ�.";
		}else if(kim < com) {
			result = "��ǻ�Ͱ� �¸��߽��ϴ�.";
		}else {
			result = "�达�� ��ǻ�Ͱ� �����ϴ�.";
		}	
		
		System.out.println("�达�� �ֻ���: "+kim);
		System.out.println("��ǻ���� �ֻ���: "+com);
		System.out.println(result);
					
	}
}
