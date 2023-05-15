package com.tech.w02mission;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelcomePanel extends JPanel{
	private JLabel message;

	public WelcomePanel() {
		message = new JLabel("이승준별다방에 오신 것을 환영합니다.");
		add(message);
	}
}
