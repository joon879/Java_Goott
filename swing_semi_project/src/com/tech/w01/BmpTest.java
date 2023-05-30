package com.tech.w01;

import java.awt.Checkbox;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class BmpTest extends JFrame {

	JTextField name, writer, maker, rent, find;
	JButton btn_insert, btn_allfind, btn_confind;
	JRadioButton con1, con2;
	String radio;
	JLabel txt_result;
	ResultSet rs;
	Statement stmt;

	public BmpTest() throws SQLException {
		Connection con = makeConnection();

		String sql = "select * from bmpinfo";
		stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		rs = stmt.executeQuery(sql);

		setTitle("���� ���� ���α׷�");
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(6, 6, 5, 5));

		//���� ���̾ƿ� south�� ��ü ��Ʈ �߰�??
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(0, 6));
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(0, 6));
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(0, 6));
		JPanel panel4 = new JPanel();
		panel4.setLayout(new GridLayout(0, 6));
		JPanel panel5 = new JPanel();
		panel5.setLayout(new GridLayout(0, 6));
		JPanel panel6 = new JPanel();
		panel6.setLayout(new GridLayout(1, 2));

		panel1.add(new JLabel(""));
		panel1.add(new JLabel("������"));
		panel1.add(new JLabel("����"));
		panel1.add(new JLabel("���ǻ�"));
		panel1.add(new JLabel("�뿩"));

		panel2.add(new JLabel("�����߰�"));
		panel2.add(name = new JTextField(5));
		panel2.add(writer = new JTextField(5));
		panel2.add(maker = new JTextField(5));
		panel2.add(rent = new JTextField(5));
		panel2.add(btn_insert = new JButton("�߰�"));
		btn_insert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�߰�!!");

				String ename = name.getText();
				String ewriter = writer.getText();
				String emaker = maker.getText();
				String erent = rent.getText();

				String sql = "insert into bmpinfo values('" + ename + "', '" + ewriter + "', '" + emaker
						+ "', '" + erent + "')";
				txt_result.setText(ename+"�߰� �Ϸ�!!");
				

				System.out.println(sql);
				try {
					stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
					stmt.executeUpdate(sql);
					rs = stmt.executeQuery("select * from bmpinfo");

				} catch (SQLException e1) {
					System.out.println("����!!");
				}

			}
		});

		panel3.add(new JLabel("��ü��� ��ȸ"));
		panel3.add(btn_allfind = new JButton("��ȸ"));
		btn_allfind.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ü ��� ��ȸ!!");
				
				try {
					new AllFind();
					dispose();
				} catch (SQLException e1) {
					System.out.println("��â ����!!");
				}
			}
		});

		
		panel5.add(new JLabel(""));		
		con1 = new JRadioButton("������");
//		con1.setSelected(true);
		panel5.add(con1);
		con2 = new JRadioButton("����");
//		con2.setSelected(true);
		panel5.add(con2);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(con1);
		bg.add(con2);
		
		con1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				radio = null;
//				if(con1.isSelected()) {
//					radio = con1.getText();
//				}
//				if(con2.isSelected()) {
//					radio = con2.getText();
//				}
//				System.out.println(radio);
				radio = con1.getText();				
			}
		});
		
		con2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				radio = con2.getText();
				
			}
		});
		
		
		
		panel4.add(new JLabel("���ǰ˻�"));
		panel4.add(find = new JTextField(5));
		panel4.add(btn_confind = new JButton("�˻�"));
		btn_confind.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("���� �˻�!!");
				
				try {
					new ConFind(find, radio);
//					dispose();
				} catch (SQLException e1) {
					System.out.println("��â ����!!");
				}
				
			}
		});


		

		panel6.add(new JLabel("��� �޽���"));
		panel6.add(txt_result = new JLabel());



		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panel5);
		add(panel6);

		setVisible(true);
	}

	public Connection makeConnection() {
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pass = "123456";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� ���� ����");

			con = DriverManager.getConnection(url, user, pass);
			System.out.println("DB���� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� ����");
		} catch (SQLException e) {
			System.out.println("DB���� ����");
		}

		return con;
	}

	public static void main(String[] args) throws SQLException {
		new BmpTest();
	}
}
