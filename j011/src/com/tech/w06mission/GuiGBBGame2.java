package com.tech.w06mission;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiGBBGame2 extends JFrame implements ActionListener{
	private JButton scissors, rock, paper;
	private JTextField text1, text2;
	private JPanel topPanel, centerPanel, bottomPanel;
	private String user="";
	private String com="";
	private String result="";
	
	public GuiGBBGame2() {
		setTitle("GuiGBBGame");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		text1 = new JTextField();
		text1.setEditable(false);
		text1.setColumns(40);
		
		topPanel = new JPanel();
		topPanel.add(text1);
		add(topPanel,"North");
		
		scissors = new JButton("����");
		rock = new JButton("����");
		paper = new JButton("��");
		
		scissors.addActionListener(this);
		rock.addActionListener(this);
		paper.addActionListener(this);
		
		centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(1,3));
		centerPanel.add(scissors);
		centerPanel.add(rock);
		centerPanel.add(paper);
		add(centerPanel, "Center");
		
		text2 = new JTextField();
		text2.setEditable(false);
		text2.setColumns(40);
		
		bottomPanel = new JPanel();
		bottomPanel.add(text2);
		add(bottomPanel, "South");
		
		
		
		
		setVisible(rootPaneCheckingEnabled);
	}
	
	public static void main(String[] args) {
		new GuiGBBGame2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("sdfsdf");
		Random ran = new Random();
		int cNum = ran.nextInt(3)+1; //1,2,3
		if (e.getSource()==scissors) {
			user = "����";
			if (cNum==1) {com="����";
				result = "���º�";
			}else if (cNum==2) {
				com="����";
				result = "��ǻ�� �¸�";
			}else if (cNum==3) {
				com="��";
				result = "���� �¸�";
			}
		}
		else if (e.getSource()==rock) {
			user = "����";
			if (cNum==1) {
				com="����";
				result = "���� �¸�";
			}else if (cNum==2) {
				com="����";
				result = "���º�";
			}else if (cNum==3) {
				com="��";
				result = "��ǻ�� �¸�";
			}
		}
		else if (e.getSource()==paper) {
			user = "��";
			if (cNum==1) {
				com="����";
				result = "��ǻ�� �¸�";
			}else if (cNum==2) {
				com="����";
				result = "���� �¸�";
			}else if (cNum==3) {
				com="��";
				result = "���º�";
			}
		}
		//������
		text1.setHorizontalAlignment(JLabel.CENTER);
		text1.setText("����: "+user+" ��ǻ��: "+com);
		text2.setHorizontalAlignment(JLabel.CENTER);
		text2.setText("���: "+result);
	}
}
