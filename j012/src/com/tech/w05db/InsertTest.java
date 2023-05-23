package com.tech.w05db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
	public static void main(String[] args) throws SQLException {
		Connection con = makeConnection();
		
		//DB�� ������ ����. (insert)
		String sql = "insert into bookinfo values('0004', '�� ���� JAVA�� ������ ���� ���ٱ���', '�������̵��', 'ȫ�浿', 28000)";
		Statement stmt = con.createStatement();
		int count = stmt.executeUpdate(sql); //executeUpdate()
		System.out.println("������: "+count);
		
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
