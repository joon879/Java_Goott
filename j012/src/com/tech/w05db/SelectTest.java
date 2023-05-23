package com.tech.w05db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {
	public static void main(String[] args) throws SQLException {
		Connection con = makeConnection();
		
		//DB�� bookinfo�� �ڹٷ� ��������. (select)
		Statement stmt = con.createStatement();
		String sql = "select * from bookinfo"; //����Ŭ���� �ۼ��� ����.
		ResultSet rs = stmt.executeQuery(sql); //executeQuery()
		
		
		while (rs.next()) {
			//�޾Ƽ� ���
			String code = rs.getString("bb_code");
			String name = rs.getString("bb_name");
			String shop = rs.getString("bb_shop");
			String writer = rs.getString("bb_writer");
			int price = rs.getInt("bb_price");
			
			//ȭ�鿡 ���
			System.out.println(code+":"+name+":"+shop+":"+writer+":"+price);
		}
		
	}

	private static Connection makeConnection() {
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
}
