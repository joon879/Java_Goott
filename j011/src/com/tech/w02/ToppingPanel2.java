package com.tech.w02;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

class ToppingPanel2 extends JPanel implements ActionListener {

	protected JCheckBox pepper, cheese, peperoni, bacon;
	protected ButtonGroup bg;
	protected String topStr = "";

	public ToppingPanel2() {
		// �ǳ�ȭ�� ����
		setLayout(new GridLayout(4, 1));
		pepper = new JCheckBox("�Ǹ�");
		cheese = new JCheckBox("ġ��");
		peperoni = new JCheckBox("����δ�");
		bacon = new JCheckBox("������");

		// ������ ����
		pepper.addActionListener(this);
		cheese.addActionListener(this);
		peperoni.addActionListener(this);
		bacon.addActionListener(this);

		// border group ����
		bg = new ButtonGroup();
		bg.add(pepper);
		bg.add(cheese);
		bg.add(peperoni);
		bg.add(bacon);
		this.setBorder(BorderFactory.createTitledBorder("Topping"));

		add(pepper);
		add(cheese);
		add(peperoni);
		add(bacon);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == pepper) {
			topStr = "pepper";
		} else if (e.getSource() == cheese) {
			topStr = "cheese";
		} else if (e.getSource() == peperoni) {
			topStr = "peperoni";
		} else if (e.getSource() == bacon) {
			topStr = "bacon";
		}
		System.out.println("Topping signal: " + topStr);

	}

}