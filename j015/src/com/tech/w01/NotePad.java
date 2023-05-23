package com.tech.w01;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringWriter;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class NotePad extends JFrame implements ItemListener, ActionListener {
	public static byte[] bytecounter;
	private boolean isButton = false;
	private String name = "����";
	private int style = 0;
	private int fontsize = 12;

	JPanel fontPanel1, fontPanel2;
	Choice fontCombo1, fontCombo2, fontCombo3;// Choice�غ�
	JButton fontConfirm, fontCancel;
	String[] fontList = { "����", "����ü", "�ü�", "�ü�ü", "�߰��", "���ü", "verdana" };// ��Ʈ �޺� ����Ʈ
	String[] fontStyleList = { "����", "�����", "����" };
	String[] fontSizeList = { "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "30", "40",
			"60" };
	JTextField txtFont, txtFontStyle, txtFontSize;// JTextField�غ�
	JFrame fontFrame;

	JMenuBar menuBar = new JMenuBar();// �޴��� ����
	JMenu mnFile = new JMenu("����(F)");// ���ϸ޴�
	JMenu mnEdit = new JMenu("����(E)");// �����޴�
	JMenu mnForm = new JMenu("����(O)");// ���ĸ޴�
	JMenu mnHelp = new JMenu("����(H)");// ���򸻸޴�

	JMenuItem new_m = new JMenuItem("���θ����(N)");// ���θ���� �׸�
	JMenuItem open_m = new JMenuItem("����(O)");// ����
	JMenuItem save_m = new JMenuItem("����(S)");//
	JMenuItem exit_m = new JMenuItem("����(X)");//
	JMenuItem cut_m = new JMenuItem("�߶󳻱�(T)");//
	JMenuItem copy_m = new JMenuItem("�����ϱ�(C)");//
	JMenuItem paste_m = new JMenuItem("�ٿ��ֱ�(P)");//
	JMenuItem allsel_m = new JMenuItem("��μ���(A)");//
	JMenuItem del_m = new JMenuItem("����(L)");//
	JMenuItem font_m = new JMenuItem("�۲�(F)...");//

	JMenuItem info_m = new JMenuItem("�޸��� ����(A)");// �޸��� ����Ȯ��
	JMenuItem time_m = new JMenuItem("�ð�����");//
	JFileChooser jfc = new JFileChooser();// ���̾� �α� â ���� Ŭ����
	JScrollPane scrollPane = null;
	JTextArea txtArea = null;
	JTextField txtField = new JTextField();

	public NotePad() {
		setTitle("�޸���-�������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ��Ʈ�е� ������Ʈ ����
		add(menuBar, "North");
		menuBar.add(mnFile);
		menuBar.add(mnEdit);
		menuBar.add(mnForm);
		menuBar.add(mnHelp);

		// ���ϸ޴��� �޴��߰�
		mnFile.add(new_m);
		mnFile.add(open_m);
		mnFile.add(save_m);
		mnFile.addSeparator();
		mnFile.add(exit_m);

		mnEdit.add(cut_m);
		mnEdit.add(copy_m);
		mnEdit.add(paste_m);
		mnEdit.add(del_m);
		mnEdit.addSeparator();
		mnEdit.add(allsel_m);
		mnEdit.add(time_m);

		mnForm.add(font_m);

		mnHelp.add(info_m);

		scrollPane = new JScrollPane(txtArea = new JTextArea()); // scrollpane�� txtArea ����
		add(scrollPane, "Center");
		add(txtField, "South");
		scrollPane.getVerticalScrollBar().setValue(scrollPane.getVerticalScrollBar().getMaximum()); // ��ũ�ѹٸ� ���ϴ����� ����.
		validate();

		// font ������Ʈ �߰�
		fontFrame = new JFrame("�۲�");
		fontPanel1 = new JPanel();
		fontPanel2 = new JPanel();

		txtFont = new JTextField(10);// �۲�
		txtFontStyle = new JTextField(8);
		txtFontSize = new JTextField(5);

		fontConfirm = new JButton("Ȯ��");
		fontCancel = new JButton("���");

//      Choice ��ü����
		fontCombo1 = new Choice();
		fontCombo2 = new Choice();
		fontCombo3 = new Choice();

//      �޺����� ����Ʈ ���
		for (int i = 0; i < fontList.length; i++) {
			fontCombo1.add(fontList[i]);
		}
		for (int i = 0; i < fontStyleList.length; i++) {
			fontCombo2.add(fontStyleList[i]);
		}
		for (int i = 0; i < fontSizeList.length; i++) {
			fontCombo3.add(fontSizeList[i]);
		}
		// choice �ʱⰪ����
		fontCombo1.select(0);
		fontCombo2.select(0);
		fontCombo3.select(4);

		// fontpanel�� label, ftextfield, choice�߰�
		fontPanel1.setLayout(new GridLayout(3, 3));
		fontPanel1.add(new Label("�۲�"));
		fontPanel1.add(new Label("�۲ý�Ÿ��"));
		fontPanel1.add(new Label("ũ��"));
		fontPanel1.add(txtFont);
		fontPanel1.add(txtFontStyle);
		fontPanel1.add(txtFontSize);
		fontPanel1.add(fontCombo1);
		fontPanel1.add(fontCombo2);
		fontPanel1.add(fontCombo3);

		// fontpanel2�� Ȯ��, ��� ��ư �߰�
		fontPanel2.setLayout(new GridLayout(3, 1));
		fontPanel2.add(fontConfirm);
		fontPanel2.add(fontCancel);

		// fontframe�� fontpanel1,2 ����
		fontFrame.add(fontPanel2, BorderLayout.EAST);
		fontFrame.add(fontPanel1, BorderLayout.CENTER);

		// fontframe�� �ݱ� �ڵ鷯����
		fontFrame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				fontFrame.setVisible(false);
			}

		});
		// �����ʺ���
		fontConfirm.addActionListener(this);
		fontCancel.addActionListener(this);
		fontCombo1.addItemListener(this);
		fontCombo2.addItemListener(this);
		fontCombo3.addItemListener(this);
		fontFrame.setBounds(300, 300, 300, 100);

		// �̺�Ʈ�� �����ʺ���
		new_m.addActionListener(this);
		open_m.addActionListener(this);
		save_m.addActionListener(this);
		exit_m.addActionListener(this);
		cut_m.addActionListener(this);
		copy_m.addActionListener(this);
		paste_m.addActionListener(this);
		allsel_m.addActionListener(this);
		del_m.addActionListener(this);
		font_m.addActionListener(this);

		// �ð����� ���
		time_m.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�ð� ����");

				// txtArea�� �ð� ���
				Calendar cal = Calendar.getInstance();
				int year = cal.get(Calendar.YEAR);
				int month = cal.get(Calendar.MONTH) + 1;
				int day = cal.get(Calendar.DAY_OF_MONTH);
				int hour = cal.get(Calendar.HOUR);
				int minute = cal.get(Calendar.MINUTE);
				int second = cal.get(Calendar.SECOND);
				txtArea.setText(txtArea.getText() + "\n" + year + "�� " + month + "�� " + day + "��");
			}
		});

		info_m.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// ���̾�α� ����
				JOptionPane.showMessageDialog(null, "������: ȫ�浿 \ncompany: goott");

			}
		});

		txtArea.addKeyListener(new KeyAdapter() {

			@Override
			public void keyReleased(KeyEvent e) {
				String text;
				int length;
				text = txtArea.getText();
				bytecounter = text.getBytes();
				length = bytecounter.length;
				txtField.setText((length + "byte(s)"));
				txtField.setHorizontalAlignment(JTextField.RIGHT); // ������ ��ġ
			}
		});

		setSize(800, 500);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String itemPressed = e.getActionCommand();
		System.out.println("��ȣ" + itemPressed);

		// ����
		if (itemPressed.equals("����(S)")) {
			if (jfc.showSaveDialog(this) == JFileChooser.CANCEL_OPTION) {
				return;
			}
			// ���� ����
			File f = jfc.getSelectedFile();
			System.out.println("���� ����: " + f);

			PrintStream ps;
			try {
				ps = new PrintStream(f);
				ps.println(txtArea.getText()); // ��°�ü�� ����(ps) txtArea������ ���
				ps.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		// ����
		if (itemPressed.equals("����(O)")) {
			if (jfc.showOpenDialog(this) == JFileChooser.CANCEL_OPTION) {
				return;
			}

			// ���� ����
			File f = jfc.getSelectedFile();
			setTitle(f.getName());

			try {
				FileReader fr = new FileReader(f);
				StringWriter sw = new StringWriter();
				while (true) {
					int ch = fr.read();

					if (ch == -1)// ������ ��
						break;
					ch = fr.read();
					sw.write(ch);

					/////////////////////////////////////////

				}
				txtArea.setText(sw.toString());
				sw.close();
				fr.close();

			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

		if (itemPressed.equals("���θ����(N)")) {
			int r = JOptionPane.showConfirmDialog(this, "�����Ͻðڽ��ϱ�", "Confirm Dialog", JOptionPane.YES_NO_OPTION);
			txtArea.setText("");
			if (r == 0) {
				jfc.showSaveDialog(this);
			}
		}
		
		if (itemPressed.equals("����(X)")) {
			int r = JOptionPane.showConfirmDialog(this, "�����Ͻðڽ��ϱ�", "Confirm Dialog", JOptionPane.YES_NO_OPTION);
			txtArea.setText("");
			if (r == 0) {
				jfc.showSaveDialog(this);
			}
			System.exit(0);
		}

		if (itemPressed.equals("�����ϱ�(C)")) {
			txtArea.copy();
		}

		if (itemPressed.equals("�ٿ��ֱ�(P)")) {
			txtArea.paste();
		}
		
		if(e.getSource().equals(font_m)) {
			fontFrame.setVisible(true);
		}
		
		if(e.getSource().equals(fontConfirm)) {
			isButton = true;
			fontFrame.setVisible(false);
			txtArea.setFont(new Font(name, style, fontsize));
			
		}else if(e.getSource().equals(fontCancel)) {
			isButton = false;
			fontFrame.setVisible(false);
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource().equals(fontCombo1)) {
	         name=fontCombo1.getSelectedItem();//�۲ü���
	         txtFont.setText(name);
	      }
	      if (e.getSource().equals(fontCombo2)) {
	         String style1=fontCombo2.getSelectedItem();
	         if (style1=="����") {
	            style=0;
	         }else if (style1=="�����") {
	            style=Font.ITALIC;
	         }else if (style1=="����") {
	            style=Font.BOLD;
	         }
	         txtFontStyle.setText(style1);
	      }
	      if (!fontCombo3.getSelectedItem().equals("���������")) {
	         fontsize=Integer.parseInt(fontCombo3.getSelectedItem());//�۲� ������
	         txtFontSize.setText(fontCombo3.getSelectedItem());
	      }
	      if (isButton) {
	         txtArea.setFont(new Font(name, style, fontsize));
	      }

	}

	public static void main(String[] args) {
		new NotePad();
	}
}