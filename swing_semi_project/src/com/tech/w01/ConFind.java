package com.tech.w01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ConFind extends JFrame {

	ResultSet rs;
	Statement stmt;
	String find;

	public ConFind(JTextField findtxt, String radio) throws SQLException {
		setTitle("���� �˻� ���");
		setSize(500, 400);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		BmpTest bt = new BmpTest();
		Connection con = bt.makeConnection();

		find = findtxt.getText();
		String sql = null;
		if(radio=="������") {
			sql = "select * from bmpinfo where name like '%"+find+"%'";
			
		}
		else if(radio=="����") {
			sql = "select * from bmpinfo where writer like '%"+find+"%'";			
		}
		stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		rs = stmt.executeQuery(sql);

		// DB�� row ���� �˾Ƴ��� ���� �ڵ�.
		int row = 0;
		if (rs.last()) {
			row = rs.getRow();
			rs.beforeFirst();
		}

		String[] header = { "����", "����", "���ǻ�", "�뿩" };
		String[][] info = new String[row][4];
		int index = 0;
		while (rs.next()) {
			info[index][0] = rs.getString(1);
			info[index][1] = rs.getString(2);
			info[index][2] = rs.getString(3);
			info[index][3] = rs.getString(4);
			index++;
		}

		// JTable�� ����.
		JTable tab = new JTable(info, header);
		JScrollPane jscp = new JScrollPane(tab);
		add(jscp);
		setVisible(true);
	}

}
