package com.tech.w06event;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SendNum extends JFrame implements ActionListener{

	private JButton btn1, btn2, btn3, btn4;
	private JTextField tf;
		
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("신호!!");
		String num = e.getActionCommand();//getActioncommand = 버튼의 글자.
		
//		System.out.println(num);
		
		if(num=="1") {
			tf.setText(tf.getText()+num);
		}else if(num=="2") {
			tf.setText(tf.getText()+num);
		}else if(num=="3") {
			tf.setText(tf.getText()+num);
		}else if(num=="reset"){
			tf.setText("");
		}
		
	}
	
	public SendNum() {
		setTitle("SendNum");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		JPanel panel = new JPanel();
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("reset");
		
		//버튼들에 수신자 부착
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		
		//판넬 그리드 레이아웃 변경
		panel.setLayout(new GridLayout(0,3,3,3));
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);

		//tf생성
		tf = new JTextField();
		
		//프레임에 부착
		add(tf,"North");
		add(panel,"Center");
		add(btn4,"South");
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SendNum();
	}
}
