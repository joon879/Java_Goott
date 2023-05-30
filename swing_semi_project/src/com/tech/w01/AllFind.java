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
		setTitle("전체 목록");
		setSize(500, 400);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BmpTest bt = new BmpTest();
		Connection con = bt.makeConnection();

		String sql = "select * from bmpinfo";
		stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		rs = stmt.executeQuery(sql);
		
//		System.out.println("디비에서 데이터 가져오기!!");
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
		
		
		
		//DB의 row 값을 알아내기 위한 코드.
		int row = 0;
		if (rs.last()) {
			row = rs.getRow();
			rs.beforeFirst();
		}
		
		
//		String[][] info = { { "java", "이승준", "굳uu", "가능" }, { "java", "이승준", "굳으", "가능" },
//				{ "java", "이승준", "굳으", "가능" }, };
		String[] header = { "제목", "저자", "출판사", "대여" };	
		String[][] info = new String[row][4];
		int index = 0;
		while (rs.next()) {
			info[index][0] = rs.getString(1);
			info[index][1] = rs.getString(2);
			info[index][2] = rs.getString(3);
			info[index][3] = rs.getString(4);
			index++;
		}
				
		bt.txt_result.setText("전체 목록 조회 완료!!");
		
		//JTable을 세팅.
		JTable tab = new JTable(info, header);
		JScrollPane jscp = new JScrollPane(tab);
		add(jscp);
		setVisible(true);

	}
}
