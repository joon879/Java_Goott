package com.tech.w01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class AllFind extends JFrame {

	ResultSet rs;
	Statement stmt;
	
	public AllFind() throws SQLException {
		setTitle("��ü ���");
		setSize(500, 400);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BmpTest bt = new BmpTest();
		Connection con = bt.makeConnection();

		String sql = "select * from bmpinfo";
		stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		rs = stmt.executeQuery(sql);
		
//		System.out.println("��񿡼� ������ ��������!!");
//		while (rs.next()) {
//			System.out.println("\t"+rs.getString(1));
//			System.out.println("\t"+rs.getString(2));
//			System.out.println("\t"+rs.getString(3));
//			System.out.println("\t"+rs.getString(4));
//		}
//		con.close();
		
		
		
//		ResultSetMetaData mdrow = rs.getMetaData();
//		int row = mdrow.getColumnCount();
//		System.out.println(row);
		
//		int row = rs.getRow();
//		System.out.println(row);
		
		
		
		//DB�� row ���� �˾Ƴ��� ���� �ڵ�.
		int row = 0;
		if (rs.last()) {
			row = rs.getRow();
			rs.beforeFirst();
		}
		
		
//		String[][] info = { { "java", "�̽���", "��uu", "����" }, { "java", "�̽���", "����", "����" },
//				{ "java", "�̽���", "����", "����" }, };
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
				
		bt.txt_result.setText("��ü ��� ��ȸ �Ϸ�!!");
		
		//JTable�� ����.
		JTable tab = new JTable(info, header);
		JScrollPane jscp = new JScrollPane(tab);
		add(jscp);
		setVisible(true);

	}
}
