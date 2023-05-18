package com.tech.w06mission;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


//카운트가 10의 배수일 때마다 유저의 승률 나오게
//나머지는 카운트만
//tbasic@daum.net
//GBB승률_이승준




public class GuiGBBGame4 extends JFrame implements ActionListener{
	private JButton scissors, rock, paper;
	private JTextField text1, text2, text3;
	private JPanel topPanel, centerPanel, bottomPanel;
	private String user="";
	private String com="";
	private String result="";
	
	//이미지 처리
	Image image1, image2, image3;
	Image changeimg1, changeimg2, changeimg3; //사이즈 조절용
	ImageIcon[] img;
	
	public GuiGBBGame4() {
		setTitle("GuiGBBGame");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		text1 = new JTextField();
		text1.setEditable(false);
		text1.setColumns(40);
		
		text3 = new JTextField();
		text3.setEditable(false);
		text3.setColumns(40);
		
		topPanel = new JPanel();
		topPanel.add(text1);
		topPanel.add(text3);
		topPanel.setLayout(new GridLayout(2,0));
		add(topPanel,"North");
		
		//이미지 가져오기
		img = new ImageIcon[3];
		img[0] = new ImageIcon("gawi2.png");
		img[1] = new ImageIcon("bawi2.png");
		img[2] = new ImageIcon("bo2.png");
		
		//사이즈 조절
		image1 = img[0].getImage();
		image2 = img[1].getImage();
		image3 = img[2].getImage();
		
		changeimg1 = image1.getScaledInstance(100, 120, Image.SCALE_SMOOTH);
		changeimg2 = image2.getScaledInstance(100, 120, Image.SCALE_SMOOTH);
		changeimg3 = image3.getScaledInstance(100, 120, Image.SCALE_SMOOTH);
		
		img[0] = new ImageIcon(changeimg1);
		img[1] = new ImageIcon(changeimg2);
		img[2] = new ImageIcon(changeimg3);		
		
		scissors = new JButton("가위");
		scissors.setIcon(img[0]);
		rock = new JButton("바위");
		rock.setIcon(img[1]);
		paper = new JButton("보");
		paper.setIcon(img[2]);
		
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
		new GuiGBBGame4();
	}

	int totCnt = 0;
	int gawiWin, bawiWin, boWin = 0;
	int totUserWin = 0;
	double winPercent = 0;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Random ran = new Random();
		int cNum = ran.nextInt(3)+1; //1,2,3
		if (e.getSource()==scissors) {
			user = "가위";
			if (cNum==1) {com="가위";
				result = "무승부";
			}else if (cNum==2) {
				com="바위";
				result = "컴퓨터 승리";
			}else if (cNum==3) {
				com="보";
				result = "유저 승리";
				gawiWin++;
				totUserWin++;
			}
		}
		else if (e.getSource()==rock) {
			user = "바위";
			if (cNum==1) {
				com="가위";
				result = "유저 승리";
				bawiWin++;
				totUserWin++;
			}else if (cNum==2) {
				com="바위";
				result = "무승부";
			}else if (cNum==3) {
				com="보";
				result = "컴퓨터 승리";
			}
		}
		else if (e.getSource()==paper) {
			user = "보";
			if (cNum==1) {
				com="가위";
				result = "컴퓨터 승리";
			}else if (cNum==2) {
				com="바위";
				result = "유저 승리";
				boWin++;
				totUserWin++;
			}else if (cNum==3) {
				com="보";
				result = "무승부";
			}
		}
		//결과출력
		text1.setHorizontalAlignment(JLabel.CENTER);
		text1.setText("유저: "+user+" 컴퓨터: "+com);
		text2.setHorizontalAlignment(JLabel.CENTER);
		text2.setText("결과: "+result);
		
		
		
		totCnt++;
		if(totCnt % 10 == 0) {
//			winPercent = Math.round(((double)totUserWin) / ((double)totCnt)*100) / 100;
			winPercent = Math.round((((double)totUserWin) / ((double)totCnt) * 100)*100)/100.0;
			
		}
		
		text3.setText("총 경기: "+totCnt+"/ 총 유저 승리: "+totUserWin+"/ 가위로 승리: "+gawiWin+"/ 승률: "+winPercent+"%");
	}
}


