package com.tech.w02;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class TypePanel2 extends JPanel implements ActionListener {
	protected JRadioButton combo, potato, bulgogi;
	protected ButtonGroup bg;
	protected String typeStr = "";

	public TypePanel2() {
		setLayout(new GridLayout(3, 1));
		combo = new JRadioButton("�޺�");
		potato = new JRadioButton("����");
		bulgogi = new JRadioButton("�Ұ��");

		// �����ں���
		combo.addActionListener(this);
		potato.addActionListener(this);
		bulgogi.addActionListener(this);

		
		// border group ����
		// ��ư�׷� �����Ͽ� ��ư�׷쿡 bg�� ���� ������ �ߺ� ���� ����!!
		bg = new ButtonGroup();
		bg.add(combo);
		bg.add(potato);
		bg.add(bulgogi);
		this.setBorder(BorderFactory.createTitledBorder("Type"));

		// �ǳڿ� ���� �߰�
		add(combo);
		add(potato);
		add(bulgogi);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == combo) {
			typeStr = "combo";
		} else if (e.getSource() == potato) {
			typeStr = "potato";
		} else if (e.getSource() == bulgogi) {
			typeStr = "bulgogi";
		}
		System.out.println("Type signal: " + typeStr);

	}

}