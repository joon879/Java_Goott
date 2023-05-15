package com.tech.w02;

import javax.swing.JLabel;
import javax.swing.JPanel;

class WelcomePanel2 extends JPanel {
	private JLabel message;

	public WelcomePanel2() {
		message = new JLabel("피자샵에 오신걸 환영합니다.");
		add(message); // 판넬에 라벨 부착.
	}
}