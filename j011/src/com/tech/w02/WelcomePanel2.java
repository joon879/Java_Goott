package com.tech.w02;

import javax.swing.JLabel;
import javax.swing.JPanel;

class WelcomePanel2 extends JPanel {
	private JLabel message;

	public WelcomePanel2() {
		message = new JLabel("���ڼ��� ���Ű� ȯ���մϴ�.");
		add(message); // �ǳڿ� �� ����.
	}
}