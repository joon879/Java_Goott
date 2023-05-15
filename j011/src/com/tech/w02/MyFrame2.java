package com.tech.w02;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyFrame2 extends JFrame implements ActionListener {
	private JButton order_button, cancel_button;
	private JPanel down_panel;
	private JTextField text;

	// 각각판넬 클래스
	WelcomePanel2 wlecomePanel = new WelcomePanel2();
	TypePanel2 typePanel = new TypePanel2();
	ToppingPanel2 toppingPanel = new ToppingPanel2();
	SizePanel2 sizePanel = new SizePanel2();

	public MyFrame2() {
		setTitle("Pizza Order");
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 결과출력
		order_button = new JButton("주문");
		cancel_button = new JButton("취소");

		// 수신자 부착
		order_button.addActionListener(this);
		cancel_button.addActionListener(this);

		text = new JTextField();
		text.setEditable(false); // 입력불가.(결과물만 출력)
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
		System.out.println("주문신호");
		int kindPrice = 0;
		int topPrice = 0;
		if (e.getSource() == order_button) {
			if (typePanel.typeStr == "combo") {
				switch (sizePanel.sizeStr) {
				case "small":
					kindPrice = 10000;	break;
				case "medium":
					kindPrice = 15000;	break;
				case "large":
					kindPrice = 20000;	break;
				default:				break;
				}
			} else if (typePanel.typeStr == "totato") {
				switch (sizePanel.sizeStr) {
				case "small":
					kindPrice = 11000;	break;
				case "medium":
					kindPrice = 16000;	break;
				case "large":
					kindPrice = 21000;	break;
				default:				break;
				}
			} else if (typePanel.typeStr == "bulgogi") {
				switch (sizePanel.sizeStr) {
				case "small":
					kindPrice = 12000;	break;
				case "medium":
					kindPrice = 17000;	break;
				case "large":
					kindPrice = 22000;	break;
				default:				break;
				}
			}
			switch (toppingPanel.topStr) {
			case "pepper":
				topPrice = 1000;		break;
			case "cheese":
				topPrice = 2000;		break;
			case "peperoni":
				topPrice = 3000;		break;
			case "bacon":
				topPrice = 4000;		break;
			default:					break;
			}
			text.setText("price: "+(kindPrice + topPrice));
		}else if (e.getSource() == cancel_button) {
			kindPrice = 0;
			topPrice = 0;
			typePanel.typeStr = "";
			toppingPanel.topStr = "";
			sizePanel.sizeStr = "";
			
			typePanel.bg.clearSelection();
			toppingPanel.bg.clearSelection();
			sizePanel.bg.clearSelection();
			
			text.setText("");
		}
	}
}