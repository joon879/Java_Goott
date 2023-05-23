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

public class StuViewer extends JFrame{
	
	JTextField no, name, addr, grade, birth, subj, score;
	JButton privButton, nextButton, insertButton, deleteButton, clearButton;
	ResultSet rs;
	Statement stmt;
	
	public StuViewer() throws SQLException {
		Connection con = makeConnection();
		String sql = "select * from studentinfo";
		stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		rs = stmt.executeQuery(sql);
		
		setTitle("Student Info");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(0,2));
		add(new JLabel("No."));
		add(no = new JTextField());
		add(new JLabel("Name"));
		add(name = new JTextField());
		add(new JLabel("Address"));
		add(addr = new JTextField());
		add(new JLabel("Grade"));
		add(grade = new JTextField());
		add(new JLabel("Birthday"));
		add(birth = new JTextField());
		add(new JLabel("Subject No."));
		add(subj = new JTextField());
		add(new JLabel("Score"));
		add(score = new JTextField());
		
		privButton = new JButton("priv");
		privButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					System.out.println("priv");	
					try {
						rs.previous();
						no.setText(""+rs.getInt("s_no"));
						name.setText(rs.getString("s_name"));
						addr.setText(rs.getString("s_addr"));
						grade.setText(""+rs.getInt("s_grade"));
						birth.setText(rs.getString("s_birth"));
						subj.setText(rs.getString("s_subj"));
						score.setText(""+rs.getInt("s_score"));
						
					} catch (SQLException e1) {
						System.out.println("priv �ڷ� ����.");
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
					no.setText(""+rs.getInt("s_no"));
					name.setText(rs.getString("s_name"));
					addr.setText(rs.getString("s_addr"));
					grade.setText(""+rs.getInt("s_grade"));
					birth.setText(rs.getString("s_birth"));
					subj.setText(rs.getString("s_subj"));
					score.setText(""+rs.getInt("s_score"));
					
				} catch (SQLException e1) {
					System.out.println("next �ڷ� ����.");
				}				
			}
		});
		insertButton = new JButton("insert");
		insertButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("insert");
				int eno = Integer.parseInt(no.getText());
				String ename = name.getText();
				String eaddr = addr.getText();
				int egrade = Integer.parseInt(grade.getText());
				String ebirth = birth.getText();
				String esubj = subj.getText();
				int escore = Integer.parseInt(score.getText());
				
				String sql = "insert into studentinfo values("+eno+",'"+ename+"','"+eaddr+"',"+egrade+",'"+ebirth+"','"+esubj+"',"+escore+")";
				
				try {
					stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
					int cnt = stmt.executeUpdate(sql);
					System.out.println("�߰� ����: "+cnt);
					rs = stmt.executeQuery("select * from studentinfo");
					
				} catch (SQLException e1) {
					System.out.println("insert ����.");
				}
				
			}
		});
		deleteButton = new JButton("delete");
		deleteButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Delete");
				int eno = Integer.parseInt(no.getText());
				String sql = "delete from studentinfo where s_no="+eno;
				
				try {
					stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
					int cnt = stmt.executeUpdate(sql);
					rs = stmt.executeQuery("select * from studentinfo");
					System.out.println("���� ����: "+cnt);
				} catch (SQLException e1) {
					System.out.println("Delete ����.");
				}
			}
		});
		clearButton = new JButton("clear");
		clearButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clear");
				no.setText("");
				name.setText("");
				addr.setText("");
				grade.setText("");
				birth.setText("");
				subj.setText("");
				score.setText("");
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
		new StuViewer();
	}
	
}
