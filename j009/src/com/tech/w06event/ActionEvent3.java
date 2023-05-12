package com.tech.w06event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionEvent3 extends JFrame{
//300 200
	
	private JButton button;
	private JLabel label;
	
	public ActionEvent3() {
		setTitle("event");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		
		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르세요!");
		label = new JLabel("아직도 버튼을 누르지 않았군요!");
		
		//MyListener2라는 클래스를 생성. 내부 클래스로 생성
		button.addActionListener(new MyListener2());
		
		
		
		
		//판넬에 버튼 부착
		panel.add(button);	
				
		//판넬에 라벨 부착
		panel.add(label);
		
		//판넬에는 부착했지만 판넬을 프레임에 부착해야 화면에 출력된다.
		//이 클래스 JFrame이 프레임이다. (this 생략 가능)
		this.add(panel);
		
		
		
		
		
		
		
		setVisible(true);
	}
	//내부클래스. 인터페이스를 상속했으니 추상메소드 구현이 필요하다.
	private class MyListener2 implements ActionListener{
		
		boolean b = true;
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("신호 감지!"+e);
			
			if(b==true) {
				button.setText("드디어 클릭");
				label.setText("버튼이 눌렸군요");
				b = false;
			}else {
				button.setText("버튼을 누르세요!");
				label.setText("아직도 버튼을 누르지 않았군요!");
				b = true;
			}
			System.out.println(b);
			
		}
		
	}
	
	public static void main(String[] args) {
		new ActionEvent3();
	}
}
