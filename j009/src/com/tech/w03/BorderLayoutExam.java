package com.tech.w03;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutExam extends JFrame {
	public static void main(String[] args) {
		new BorderLayoutExam(); //생성자 호출
		
	}
	
	public BorderLayoutExam() {//생성자
		System.out.println("초기화 작업 프레임 만들기");
		setTitle("BorderLayout");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout()); //배치관리자를 보더레이아웃에 사용한다.
		
//		버튼생성
		 JButton btn1 = new JButton("호출1");//버튼 컴포넌트 생성.
		 JButton btn2 = new JButton("호출2");//버튼 컴포넌트 생성.
		 JButton btn3 = new JButton("호출3");//버튼 컴포넌트 생성.
		 JButton btn4 = new JButton("호출4");//버튼 컴포넌트 생성.
		 JButton btn5 = new JButton("호출5");//버튼 컴포넌트 생성.
		 
//		 컴포넌트 프레임에 부착
		 add(btn1,"North");//첫글자만 대문자로
		 add(btn2,"West");
		 add(btn3,"East");
		 add(btn4,"South");
		 add(btn5,"Center");
		 
		 setVisible(true);
		 
		 
	}
}
