package com.tech.w02mission;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelcomePanel extends JPanel{
	private JLabel message;

	public WelcomePanel() {
		message = new JLabel("�̽��غ��ٹ濡 ���� ���� ȯ���մϴ�.");
		add(message);
	}
}
