package com.tech.w02;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyCounter4 extends JFrame implements ActionListener{
	private JLabel[] labels;
	private JButton button;
	private int[] numbers;
		
	//이미지 저장 그릇 선언
	private ImageIcon[] imgs;
	
	
	public MyCounter4(){
		setTitle("slotmachine");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,300);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		labels = new JLabel[3];
		numbers = new int[3];
		
		//이미지 배열 생성
		imgs = new ImageIcon[10];
		
		//이미지 보관
		for (int i = 0; i < imgs.length; i++) {
			imgs[i] = new ImageIcon("src/"+ i +".png");
		}
		
		
		for (int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel("");//이미지로 대체할거라 빈 공간으로 둔다.
			labels[i].setFont(new Font("impact", Font.BOLD, 100));
			labels[i].setSize(100,100);
			labels[i].setLocation(100+100*i, 20);
			
			
			//라벨에 이미지 넣기
			labels[i].setIcon(imgs[0]);
			//판넬에 추가
			panel.add(labels[i]);
		}
		//버튼 추가
		button = new JButton("땡겨!");
		button.setSize(250,50);
		button.setLocation(100, 150);
		panel.add(button);
		
		button.addActionListener(this);
		
		add(panel);
		
		
		
		setVisible(true);
		
	}

	int cnt = 0;
	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random()*10);
//			labels[i].setText(numbers[i]+"");
			labels[i].setIcon(imgs[numbers[i]]);
			System.out.print(numbers[i]);
		}
		System.out.println();
		
		if(numbers[0]==numbers[1] && numbers[1]==numbers[2]) {
			button.setText("축하합니다"+cnt);
			System.out.println("축하합니다"+cnt);
		}
		cnt++;
	}
}


public class SlotMachine4 {
		
	public SlotMachine4() {
		
	}
	
	
	public static void main(String[] args) {
		new MyCounter4();
	}
}
