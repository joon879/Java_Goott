package com.tech.tab3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class MainClass implements ActionListener{
	
	JFrame f;
	ViewA a;
	ViewB b;
	ViewC c;
	ViewD d;
	ViewHome home;
	
	static JTabbedPane pane;	
	
	public MainClass() {
		f = new JFrame("ȫ�浿 ������Ʈ");
		f.setLayout(new BorderLayout());
		a = new ViewA();
		b = new ViewB();
		c = new ViewC();
		d = new ViewD();
		home = new ViewHome();
		
		a.btn1.addActionListener(this);
		a.cbox.addActionListener(this);
		d.cbox.addActionListener(this);
		home.btnhome.addActionListener(this);
		
		
		f.add(a,"North");
		f.add(home,"South");
		
		pane = new JTabbedPane();
		pane.add("������", a);
		pane.add("�������", b);
		pane.add("�������", c);
		pane.add("��������", d);
	
		
		
		f.add(pane,BorderLayout.CENTER);
		f.setSize(500,400);
		f.setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) {
		new MainClass();
	}

	int price = 0;
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("sign");
		
		
		if (e.getSource()==a.cbox) {
			System.out.println(a.cbox.getSelectedItem());
			if (a.cbox.getSelectedItem()=="apple1") {
				price += 10;
			} else if (a.cbox.getSelectedItem()=="apple2") {
				price += 20;
			} else if (a.cbox.getSelectedItem()=="apple3") {
				price += 30;
			}
		}else if (e.getSource()==a.btn1){
			b.field.setText("[�������]: "+price);
			pane.setSelectedIndex(1);
		}else if (e.getSource()==home.btnhome){
			pane.setSelectedIndex(0);
		}else if (e.getSource()==d.cbox){
			System.out.println(d.cbox.getSelectedItem());
			if (d.cbox.getSelectedItem()=="banana1") {
				price += 1000000;
			} else if (d.cbox.getSelectedItem()=="banana2") {
				price += 2000000;
			} else if (d.cbox.getSelectedItem()=="banana3") {
				price += 3000000;
			}
			pane.setSelectedIndex(2);
			c.fieldc.setText("�޾ƿ�: "+price);
		}
	}

}
