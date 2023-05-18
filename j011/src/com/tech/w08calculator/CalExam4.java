package com.tech.w08calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalExam4 extends JFrame implements ActionListener{
	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;
	private String[] labels = {"Backspace","","","CE","C",   
	         "7","8","9","/","sqrt",   
	         "4","5","6","x","%",   
	         "1","2","3","-","1/x",   
	         "0","+/-",".","+","=" 			
	};
	
	public static void main(String[] args) {
		new CalExam4();
	}

	public CalExam4() {
		setTitle("����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 250);
		
		setLayout(new BorderLayout());//���⿡ 2���� ��ġ�Ѵ�.
		tField = new JTextField(45);
		tField.setText("0.");
		panel = new JPanel();
		panel.setLayout(new GridLayout(0,5,3,3));
		
		buttons = new JButton[25];
		
		int index = 0;
		//�ݺ������� ��ư ����
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				buttons[index] = new JButton(labels[index]); //��ư ����
				buttons[index].addActionListener(this);
				if(col >= 3) {
					buttons[index].setForeground(Color.red);
					
				}else {
					buttons[index].setForeground(Color.blue);
				}
				buttons[index].setBackground(Color.white);
				panel.add(buttons[index]);
				index++;
			}
		}
		
//		add(panel);
		//�������̾ƿ��� �ؽ�Ʈ�ʵ��ǳڰ� ��ư�ǳ� ���!! �̰� ������ ȭ�鿡 �ȳ���!!
		add(tField,"North");
		add(panel,"Center");
		
		setVisible(true);
	}
	
	private double result = 0; //�����
	private String operator = "=";
	private boolean startNumber = true; //������ ���ڿ� ���ڸ� ���� ������?
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("��ȣ��ȣ");
		String command = e.getActionCommand();
		
		if(command.charAt(0)=='C') { //clear
			startNumber = true;
			result = 0;
			operator = "=";
			tField.setText("0.0");
		}
		//���� ����(.�� ���ڷ�)
		else if (command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.equals(".")) {
			//���ڰ� ���� ��������, �� ��° ��������.
			if (startNumber == true) {//����(ó�� 0���� ����� ���� ���ڷ� ����Ǵ� �κ� + �� ��° ���� �Է� ��.)
				tField.setText(command);
			}else {
				tField.setText(tField.getText() + command); //���� ���ڿ� Ŭ���� ���� �̾ ���.
			}
			startNumber = false;//�ּ� �� ���� ���ڰ� �ԷµǾ��⿡ ù ��° ���ڴ� �ƴϰ� ��.
		}
		else {
			if (startNumber) {//������ ���� ����
				if(command.equals("-")) { //����
					tField.setText(command);
				}else {
					operator = command; //������ ��ȣ
				}
			}
			else { //���ó��
				Double x = Double.parseDouble(tField.getText());//�׵����� ��(����)���� ����� ��ȯ.
				calculate(x);//������ ����ϴ� �Լ� ȣ��.
				operator = command; //=�� �����ܰ�?
				startNumber = true;
			}
		}
		
	}
	
	private void calculate(Double x) {
		if (operator.equals("+")) {
			result = result + x;
		}else if (operator.equals("-")) {
			result = result - x;
		}else if (operator.equals("x")) {
			result = result * x;
		}else if (operator.equals("/")) {
			result = result / x;
		}else if (operator.equals("=")) {
			result = x;
		}
		tField.setText(result+"");
	}
}
