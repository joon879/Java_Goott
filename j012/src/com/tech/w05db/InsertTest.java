package com.tech.w05db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
	public static void main(String[] args) throws SQLException {
		Connection con = makeConnection();
		
		//DB에 데이터 삽입. (insert)
		String sql = "insert into bookinfo values('0004', '난 정말 JAVA를 공부한 적이 없다구요', '오렌지미디어', '홍길동', 28000)";
		Statement stmt = con.createStatement();
		int count = stmt.executeUpdate(sql); //executeUpdate()
		System.out.println("실행결과: "+count);
		
	}

	private static Connection makeConnection() {
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pass = "123456";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 적재 성공");

			con = DriverManager.getConnection(url, user, pass);
			System.out.println("DB연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 없음");
		} catch (SQLException e) {
			System.out.println("DB연결 실패");
		}

		return con;
	}
}
