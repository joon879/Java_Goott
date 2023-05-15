package com.tech.w05race;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class RaceThreadx extends Thread {
	RaceFrame frame;
	int x, y, w, h;

	public RaceThreadx(RaceFrame frame, int x, int y, int w, int h) {
		this.frame = frame;
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	@Override
	public void run() {
		System.out.println("������ ����");
		// �������� �� sleep�ð����� ����, x���� finish���α��� ����.
		Random r = new Random();
		Dimension d = frame.getSize();
//		int widthLast = (int) (d.getWidth() - (2 * x)) + 50;
		int widthLast = 800;
//		System.out.println("widthLast: "+widthLast);
		for (; x < widthLast; x += 20) {
			frame.repaint();
			try {
				Thread.sleep(r.nextInt(100) + 30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		frame.repaint();
		
	}
	
	@Override
	public void interrupt() {
		super.interrupt();
	}
}

class RaceFrame extends JFrame implements ActionListener {
	RaceThreadx thread1;
	RaceThreadx thread2;
	RaceThreadx thread3;
	RaceThreadx thread4;
	RaceThreadx thread5;

	// ��ư�غ�
	JButton startButton = new JButton("����");
	JButton clearButton = new JButton("�ʱ�ȭ");
	JButton pauseButton = new JButton("����");

	Dimension d;

	int i[] = { 0, 0, 0, 0, 0 };

	boolean re1 = true, re2 = true, re3 = true, re4 = true, re5 = true;

	private Image img, img1, img2, img3, img4;

	public RaceFrame() {
		setLayout(new BorderLayout());

		// ��ư�� ������ ����
		startButton.addActionListener(this);
		clearButton.addActionListener(this);
		pauseButton.addActionListener(this);

		// �ǳ� �غ�
		JPanel p = new JPanel();
		p.add(startButton);
		p.add(clearButton);
		p.add(pauseButton);
		add(p, "North");

		// ������ ��ü ����
		thread1 = new RaceThreadx(this, 50, 100, 38, 36);
		thread2 = new RaceThreadx(this, 50, 150, 38, 36);
		thread3 = new RaceThreadx(this, 50, 200, 38, 36);
		thread4 = new RaceThreadx(this, 50, 250, 38, 36);
		thread5 = new RaceThreadx(this, 50, 300, 38, 36);

		// imgó��
		img = Toolkit.getDefaultToolkit().getImage("src/car5.png");
		img1 = Toolkit.getDefaultToolkit().getImage("src/car1.png");
		img2 = Toolkit.getDefaultToolkit().getImage("src/car5.png");
		img3 = Toolkit.getDefaultToolkit().getImage("src/car5.png");
		img4 = Toolkit.getDefaultToolkit().getImage("src/car5.png");

	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		System.out.println("painting");
		g.drawLine(750, 0, 750, 400);

//		g.drawString("Lee 1st", 200, 400); //200,400��ġ�� ��Ʈ���� ���
		
		// ��� ����
		for (int k = 0; k < i.length; k++) {
			if (thread1.x >= 750 && i[k] == 0 && re1) {// finish ���
				i[k] = 1;
				re1 = false;
				break;
			} else if (thread2.x >= 750 && i[k] == 0 && re2) {// finish ���
				i[k] = 2;
				re2 = false;
				break;
			} else if (thread3.x >= 750 && i[k] == 0 && re3) {// finish ���
				i[k] = 3;
				re3 = false;
				break;
			} else if (thread4.x >= 750 && i[k] == 0 && re4) {// finish ���
				i[k] = 4;
				re4 = false;
				break;
			} else if (thread5.x >= 750 && i[k] == 0 && re5) {// finish ���
				i[k] = 5;
				re5 = false;
				break;
			}
		}
		System.out.println(Arrays.toString(i));
		
		if(i[0] > 0) g.drawString("1��: "+i[0]+"�� �ڵ���", 260, 350);
		if(i[1] > 0) g.drawString("2��: "+i[1]+"�� �ڵ���", 260, 350+20);
		if(i[2] > 0) g.drawString("3��: "+i[2]+"�� �ڵ���", 260, 350+40);
		if(i[3] > 0) g.drawString("4��: "+i[3]+"�� �ڵ���", 260, 350+60);
		if(i[4] > 0) g.drawString("5��: "+i[4]+"�� �ڵ���", 260, 350+80);
		
		
//		g.drawString("1��: "+i[0]+"�� �ڵ���", 260, 350);
//		g.drawString("2��: "+i[1]+"�� �ڵ���", 260, 350+20);
//		g.drawString("3��: "+i[2]+"�� �ڵ���", 260, 350+40);
//		g.drawString("4��: "+i[3]+"�� �ڵ���", 260, 350+60);
//		g.drawString("5��: "+i[4]+"�� �ڵ���", 260, 350+80);

		g.drawImage(img, thread1.x, thread1.y, thread1.w, thread1.h, this);
		g.drawImage(img1, thread2.x, thread2.y, thread2.w, thread2.h, this);
		g.drawImage(img, thread3.x, thread3.y, thread3.w, thread3.h, this);
		g.drawImage(img, thread4.x, thread4.y, thread4.w, thread4.h, this);
		g.drawImage(img, thread5.x, thread5.y, thread5.w, thread5.h, this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("��ư��ȣ");

		// ���۹�ư ���ý�
		if (e.getSource() == startButton) {
			thread1.start();
			thread2.start();
			thread3.start();
			thread4.start();
			thread5.start();
		}
		// �ʱ�ȭ��ư ���� ��
		else if (e.getSource() == clearButton) {
			System.out.println("�ʱ�ȭ");
			
			//������ ��ü �ٽ� ����.
			thread1 = new RaceThreadx(this, 50, 100, 38, 36);
			thread2 = new RaceThreadx(this, 50, 150, 38, 36);
			thread3 = new RaceThreadx(this, 50, 200, 38, 36);
			thread4 = new RaceThreadx(this, 50, 250, 38, 36);
			thread5 = new RaceThreadx(this, 50, 300, 38, 36);
			
			for (int k = 0; k < i.length; k++) {
				i[k] = 0;				
			}
			re1 = true;
			re2 = true;
			re3 = true;
			re4 = true;
			re5 = true;
			repaint();
		}
		
		else if(e.getSource() == pauseButton) {
			System.out.println("������������");
			if(pauseButton.getText()=="����") {
				thread1.suspend();
				thread2.suspend();
				thread3.suspend();
				thread4.suspend();
				thread5.suspend();
				
				pauseButton.setText("�����");
			}
			else if(pauseButton.getText()=="�����") {
				thread1.resume();
				thread2.resume();
				thread3.resume();
				thread4.resume();
				thread5.resume();
				
				pauseButton.setText("����");
			}
			
			
			
		}

	}

}

public class CarRace {
	public static void main(String[] args) {
		RaceFrame frame = new RaceFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(300, 100);
		frame.setSize(850, 500);

		frame.setVisible(true);
	}
}
