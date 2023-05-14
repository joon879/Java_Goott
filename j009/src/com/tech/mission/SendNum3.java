package com.tech.mission;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SendNum3 extends JFrame implements ActionListener{

	private JButton btn1, btn2, btn3, btn4, btn5, btn6;
	private JTextField tf;
		
	private int num1, num2, result;
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("��ȣ!!");
//		String num = e.getActionCommand();//getActioncommand = ��ư�� ����.
		
//		e.getSource();//�̰� ��ư ������ �ǹ��Ѵ�.
		if(e.getSource()==btn1) {
			tf.setText(tf.getText()+e.getActionCommand());
		}else if(e.getSource()==btn2) {
			tf.setText(tf.getText()+e.getActionCommand());
		}else if(e.getSource()==btn3) {
			tf.setText(tf.getText()+e.getActionCommand());
		}else if(e.getSource()==btn4) {  //+
			this.num1 = Integer.parseInt(tf.getText());
			tf.setText("+");
		}else if(e.getSource()==btn5) {  //=
			this.num2 = Integer.parseInt(tf.getText());
			result = num1 + num2;
//			tf.setText(Integer.toString(result));
			tf.setText("�հ�: "+result);
		}else {  //reset
			tf.setText("");
		}

	}
	
	public SendNum3() {
		setTitle("SendNum");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		JPanel panel = new JPanel();
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("+");
		btn5 = new JButton("=");
		btn6 = new JButton("reset");
		
		//��ư�鿡 ������ ����
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		
		//�ǳ� �׸��� ���̾ƿ� ����
		panel.setLayout(new GridLayout(0,5,3,3));
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		

		//tf����
		tf = new JTextField();
		
		//�����ӿ� ����
		add(tf,"North");
		add(panel,"Center");
		add(btn6,"South");
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SendNum3();
	}
}
