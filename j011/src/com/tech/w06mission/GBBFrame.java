package com.tech.w06mission;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GBBFrame extends JFrame implements ActionListener{

	private JPanel statusPanel, gbbPanel, resultPanel;
	private JButton gawi_btn, bawi_btn, bo_btn;
	private JTextField status_text, result_text;
//	private String[] gbbStr = {"gawi", "bawi", "bo"};
	private int yNum, cNum;
	private JLabel[] labels;
	private ImageIcon[] icon = new ImageIcon[3];
	
//	StatusPanel statusPanel = new StatusPanel();
//	GBBPanel gbbPanel = new GBBPanel();
//	ResultPanel resultPanel = new ResultPanel();
	
	
	public GBBFrame() {
		setTitle("GBB Game");
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		labels = new JLabel[3];
		
		
		JPanel gbbPanel = new JPanel();
		gawi_btn = new JButton(new ImageIcon("src/gawi.png"));
		bawi_btn = new JButton(new ImageIcon("src/bawi.png"));
		bo_btn = new JButton(new ImageIcon("src/bo.png"));
		
		
		gawi_btn.addActionListener(this);
		bawi_btn.addActionListener(this);
		bo_btn.addActionListener(this);
		
		
		gbbPanel.setLayout(new GridLayout(0, 3));
		
		gbbPanel.add(gawi_btn);
		gbbPanel.add(bawi_btn);
		gbbPanel.add(bo_btn);
		
		
		
		
		status_text = new JTextField();
		status_text.setEditable(false);
		status_text.setColumns(25);
		
		statusPanel = new JPanel();
		statusPanel.add(status_text);
		
		
		result_text = new JTextField();
		result_text.setEditable(false);
		result_text.setColumns(25);
		
		resultPanel = new JPanel();
		resultPanel.add(result_text);
			
		
		
		add(statusPanel, "North");
		add(gbbPanel, "Center");
		add(resultPanel, "South");
		
		setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Random ran = new Random();
		int cNum = ran.nextInt(3)+1;
			
		if(e.getSource()==gawi_btn) {
			if(cNum==1) {
				status_text.setText("유저: 가위 vs "+"컴퓨터: 가위");
				result_text.setText("무승부");
			}else if(cNum==2) {
				status_text.setText("유저: 가위 vs "+"컴퓨터: 바위");
				result_text.setText("컴퓨터 승리");
			}else if(cNum==3) {
				status_text.setText("유저: 가위 vs "+"컴퓨터: 보");
				result_text.setText("유저 승리");
			}
		}else if(e.getSource()==bawi_btn) {
			if(cNum==1) {
				status_text.setText("유저: 바위 vs "+"컴퓨터: 가위");
				result_text.setText("유저 승리");
			}else if(cNum==2) {
				status_text.setText("유저: 바위 vs "+"컴퓨터: 바위");
				result_text.setText("무승부");
			}else if(cNum==3) {
				status_text.setText("유저: 바위 vs "+"컴퓨터: 보");
				result_text.setText("컴퓨터 승리");
			}
		}else if(e.getSource()==bo_btn) {
			if(cNum==1) {
				status_text.setText("유저: 보 vs "+"컴퓨터: 가위");
				result_text.setText("컴퓨터 승리");
			}else if(cNum==2) {
				status_text.setText("유저: 보 vs "+"컴퓨터: 가위");
				result_text.setText("유저 승리");
			}else if(cNum==3) {
				status_text.setText("유저: 보 vs "+"컴퓨터: 가위");
				result_text.setText("무승부");
			}
		}
		
	}

}
