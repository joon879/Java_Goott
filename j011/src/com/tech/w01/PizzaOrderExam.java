package com.tech.w01;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class MyFrame extends JFrame implements ActionListener {
	private JButton order_button, cancel_button;
	private JPanel down_panel;
	private JTextField text;

	// 각각판넬 클래스
	WelcomePanel2 wlecomePanel = new WelcomePanel2();
	TypePanel2 typePanel = new TypePanel2();
	ToppingPanel toppingPanel = new ToppingPanel();
	SizePanel sizePanel = new SizePanel();

	public MyFrame() {
		setTitle("Pizza Order");
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//결과출력
		order_button = new JButton("주문");
		cancel_button = new JButton("취소");
		
		//수신자 부착
		order_button.addActionListener(this);
		cancel_button.addActionListener(this);
		
		text = new JTextField();
		text.setEditable(false); //입력불가.(결과물만 출력)
		text.setColumns(25);
		
		down_panel = new JPanel();
		down_panel.add(order_button);
		down_panel.add(cancel_button);
		down_panel.add(text);
		

		// 타입판넬, 토핑판넬, 사이즈판넬을 부착할 판넬을 만든다.
		JPanel centerJPanel = new JPanel(new GridLayout(0, 3));
		centerJPanel.add(typePanel);
		centerJPanel.add(toppingPanel);
		centerJPanel.add(sizePanel);
		
		// 웰컴판넬 부착
		add(wlecomePanel, "North");
		add(centerJPanel, "Center");
		add(down_panel, "South");
		
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}
}

class WelcomePanel extends JPanel {
	private JLabel message;

	public WelcomePanel() {
		message = new JLabel("피자샵에 오신걸 환영합니다.");
		add(message); // 판넬에 라벨 부착.
	}
}

class TypePanel extends JPanel implements ActionListener {
	protected JRadioButton combo, potato, bulgogi;
	protected ButtonGroup bg;
	protected String typeStr = "";

	public TypePanel() {
		setLayout(new GridLayout(3, 1));
		combo = new JRadioButton("콤보");
		potato = new JRadioButton("감자");
		bulgogi = new JRadioButton("불고기");

		// 수신자부착
		combo.addActionListener(this);
		potato.addActionListener(this);
		bulgogi.addActionListener(this);

		// border group 설정
		bg = new ButtonGroup();
		bg.add(combo);
		bg.add(potato);
		bg.add(bulgogi);
		this.setBorder(BorderFactory.createTitledBorder("Type"));

		// 판넬에 콤포 추가
		add(combo);
		add(potato);
		add(bulgogi);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Type signal");
	}

}

class ToppingPanel extends JPanel implements ActionListener {

	protected JCheckBox pepper, cheese, peperoni, bacon;
	protected ButtonGroup bg;
	protected String topStr = "";

	public ToppingPanel() {
		// 판넬화면 구성
		setLayout(new GridLayout(4, 1));
		pepper = new JCheckBox("피망");
		cheese = new JCheckBox("치즈");
		peperoni = new JCheckBox("페페로니");
		bacon = new JCheckBox("베이컨");

		// 수신자 부착
		pepper.addActionListener(this);
		cheese.addActionListener(this);
		peperoni.addActionListener(this);
		bacon.addActionListener(this);

		// border group 설정
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
		System.out.println("Topping signal");

	}

}

class SizePanel extends JPanel implements ActionListener {
	
	protected JRadioButton small, medium, large;
	protected ButtonGroup bg;
	protected String sizeStr = "";
	
	public SizePanel() {
		// 판넬화면 구성
				setLayout(new GridLayout(3,1));
				small = new JRadioButton("small");
				medium = new JRadioButton("medium");
				large = new JRadioButton("large");
				
			
				// 수신자 부착
				small.addActionListener(this);
				medium.addActionListener(this);
				large.addActionListener(this);
		
				
				// border group 설정
				bg = new ButtonGroup();
				bg.add(small);
				bg.add(medium);
				bg.add(large);
				
				this.setBorder(BorderFactory.createTitledBorder("Size"));

				add(small);
				add(medium);
				add(large);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Size signal");

	}

}

public class PizzaOrderExam {
	public static void main(String[] args) {
		new MyFrame2();
	}
}
