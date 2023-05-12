package com.tech.w06event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionEvent4 extends JFrame {
//300 200

	private JButton button1, button2;
	private JLabel label;

	public ActionEvent4() {
		setTitle("event");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);

		JPanel panel = new JPanel();
		button1 = new JButton("버튼1");
		button2 = new JButton("버튼2");
		label = new JLabel("아직도 버튼을 누르지 않았군요!");

		// MyListener2라는 클래스를 생성. 내부 클래스로 생성
		button1.addActionListener(new MyListener4());
		button2.addActionListener(new MyListener4());

		// 판넬에 버튼 부착
		panel.add(button1);
		panel.add(button2);

		// 판넬에 라벨 부착
		panel.add(label);

		// 판넬에는 부착했지만 판넬을 프레임에 부착해야 화면에 출력된다.
		// 이 클래스 JFrame이 프레임이다. (this 생략 가능)
		this.add(panel);

		setVisible(true);
	}

	// 내부클래스. 인터페이스를 상속했으니 추상메소드 구현이 필요하다.
	private class MyListener4 implements ActionListener {

		boolean flag1 = true;
		boolean flag2 = true;

		@Override
		public void actionPerformed(ActionEvent e) {
			//jbutton형식으로 형변환해야 버튼의 텍스트값을 읽어들임.
			JButton button = (JButton) e.getSource();
			System.out.println("신호 감지!" + e);

			if (button.getText() == "버튼1") {
				if (flag1 == true) {
					label.setText("버튼1 ON");
					flag1 = false;
				} else {
					label.setText("버튼1 OFF");
					flag1 = true;
				}
			} else if (button.getText() == "버튼2") {
				if (flag2 == true) {
					label.setText("버튼2 ON");
					flag2 = false;
				} else {
					label.setText("버튼2 OFF");
					flag2 = true;
				}
			}
		}

	}

	public static void main(String[] args) {
		new ActionEvent4();
	}
}
