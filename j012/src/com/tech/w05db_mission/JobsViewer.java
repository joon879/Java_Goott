package com.tech.w05db_mission;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JobsViewer extends JFrame {

	JTextField job_id, job_title, min_salary, max_salary;
	JButton privButton, nextButton, insertButton, deleteButton, clearButton;
	ResultSet rs;
	Statement stmt;

	public JobsViewer() throws SQLException {

		Connection con = makeConnection();
		String sql = "select * from jobs";
		stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		rs = stmt.executeQuery(sql);

		setTitle("Student Info");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new GridLayout(0, 2));
		add(new JLabel("JOB_ID"));
		add(job_id = new JTextField());
		add(new JLabel("JOB_TITLE"));
		add(job_title = new JTextField());
		add(new JLabel("MIN_SALARY"));
		add(min_salary = new JTextField());
		add(new JLabel("MAX_SALARY"));
		add(max_salary = new JTextField());

		privButton = new JButton("priv");
		privButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("priv");

				try {
					rs.previous();
					job_id.setText(rs.getString("JOB_ID"));
					job_title.setText(rs.getString("JOB_TITLE"));
					min_salary.setText("" + rs.getInt("MIN_SALARY"));
					max_salary.setText("" + rs.getInt("MAX_SALARY"));
				} catch (SQLException e1) {
					System.out.println("priv 자료 없음.");
				}

			}
		});

		nextButton = new JButton("next");
		nextButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("next");

				try {
					rs.next();
					job_id.setText(rs.getString("JOB_ID"));
					job_title.setText(rs.getString("JOB_TITLE"));
					min_salary.setText("" + rs.getInt("MIN_SALARY"));
					max_salary.setText("" + rs.getInt("MAX_SALARY"));
				} catch (SQLException e1) {
					System.out.println("next 자료 없음.");
				}
			}
		});

		insertButton = new JButton("insert");
		insertButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("insert");

				String ejob_id = job_id.getText();
				String ejob_title = job_title.getText();
				int emin_salary = Integer.parseInt(min_salary.getText());
				int emax_salary = Integer.parseInt(max_salary.getText());

				String sql = "insert into jobs values('" + ejob_id + "','" + ejob_title + "'," + emin_salary + ","
						+ emax_salary + ")";

				try {
					stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
					int cnt = stmt.executeUpdate(sql);
					System.out.println("추가 갯수: " + cnt);
					rs = stmt.executeQuery("select * from jobs");
				} catch (SQLException e1) {
					System.out.println("insert 실패.");
				}

			}
		});

		deleteButton = new JButton("delete");
		deleteButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Delete");
				String ejob_id = job_id.getText();
				String sql = "delete from jobs where job_id='" + ejob_id+"'";

				try {
					stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
					int cnt = stmt.executeUpdate(sql);
					rs = stmt.executeQuery("select * from jobs");
					System.out.println("삭제 갯수: " + cnt);
				} catch (SQLException e1) {
					System.out.println("Delete 실패.");
				}
			}
		});

		clearButton = new JButton("clear");
		clearButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clear");
				
				job_id.setText("");
				job_title.setText("");
				min_salary.setText("");
				max_salary.setText("");
				
			}
		});

		add(privButton);
		add(nextButton);
		add(insertButton);
		add(deleteButton);
		add(clearButton);

		setVisible(true);

	}

	private Connection makeConnection() {
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

	public static void main(String[] args) throws SQLException {
		new JobsViewer();
	}
}
