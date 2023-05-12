package com.tech.w06event;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionEvent1 extends JFrame{
//300 200
	
	private JButton button;
	private JLabel label;
	public ActionEvent1() {
		setTitle("event");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		
		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르세요!");
		label = new JLabel("아직도 버튼을 누르지 않았군요!");
		
		//판넬에 버튼 부착
		panel.add(button);	
				
		//판넬에 라벨 부착
		panel.add(label);
		
		//판넬에는 부착했지만 판넬을 프레임에 부착해야 화면에 출력된다.
		//이 클래스 JFrame이 프레임이다. (this 생략 가능)
		this.add(panel);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ActionEvent1();
	}
}
