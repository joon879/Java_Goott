package com.tech.w05db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect2 {

	//�ڹٿ��� ����Ŭ�� ����
	
	public static void main(String[] args) {
		//DB����
		Connection con = makeConnection();
	}

	private static Connection makeConnection() {
		//Ŀ�ؼ��� �ϼ� �� ����
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
