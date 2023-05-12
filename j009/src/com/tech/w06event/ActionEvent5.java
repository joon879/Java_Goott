package com.tech.w06event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionEvent5 extends JFrame implements ActionListener{
//300 200

	private JButton button1, button2;
	private JLabel label;
	boolean flag1 = true;
	boolean flag2 = true;

	public ActionEvent5() {
		setTitle("event");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);

		JPanel panel = new JPanel();
		button1 = new JButton("버튼1");
		button2 = new JButton("버튼2");
		label = new JLabel("아직도 버튼을 누르지 않았군요!");

		
		button1.addActionListener(this);
		button2.addActionListener(this);

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



	public static void main(String[] args) {
		new ActionEvent5();
	}

	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
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
