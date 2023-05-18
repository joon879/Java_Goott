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
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 250);
		
		setLayout(new BorderLayout());//여기에 2개를 배치한다.
		tField = new JTextField(45);
		tField.setText("0.");
		panel = new JPanel();
		panel.setLayout(new GridLayout(0,5,3,3));
		
		buttons = new JButton[25];
		
		int index = 0;
		//반복문으로 버튼 생성
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				buttons[index] = new JButton(labels[index]); //버튼 생성
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
		//보더레이아웃에 텍스트필드판넬과 버튼판넬 출력!! 이게 없으면 화면에 안나옴!!
		add(tField,"North");
		add(panel,"Center");
		
		setVisible(true);
	}
	
	private double result = 0; //결과값
	private String operator = "=";
	private boolean startNumber = true; //기존의 숫자에 숫자를 더할 것인지?
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("신호신호");
		String command = e.getActionCommand();
		
		if(command.charAt(0)=='C') { //clear
			startNumber = true;
			result = 0;
			operator = "=";
			tField.setText("0.0");
		}
		//숫자 구분(.도 숫자로)
		else if (command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.equals(".")) {
			//숫자가 시작 숫자인지, 두 번째 숫자인지.
			if (startNumber == true) {//시작(처음 0에서 계산할 시작 숫자로 변경되는 부분 + 두 번째 숫자 입력 시.)
				tField.setText(command);
			}else {
				tField.setText(tField.getText() + command); //기존 숫자에 클릭한 숫자 이어서 출력.
			}
			startNumber = false;//최소 한 번의 숫자가 입력되었기에 첫 번째 숫자는 아니게 됨.
		}
		else {
			if (startNumber) {//숫자의 시작 시점
				if(command.equals("-")) { //음수
					tField.setText(command);
				}else {
					operator = command; //연산의 기호
				}
			}
			else { //계산처리
				Double x = Double.parseDouble(tField.getText());//그동안의 값(문자)에서 더블로 변환.
				calculate(x);//실제로 계산하는 함수 호출.
				operator = command; //=은 다음단계?
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
