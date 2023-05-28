package com.tech.w01board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class ListBoard {
	
	HashMap<String, Object> data = new HashMap<String, Object>();
	Scanner sc = new Scanner(System.in);
	ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
	
	public static void main(String[] args) {
		ListBoard bd = new ListBoard();
		bd.seeBoard();
	}
	
	public void seeBoard() {
		int number = 1;
		
		while (true) {
			
			System.out.println("================================");
			System.out.println("No\t����\t�ۼ���\t�ۼ���");
			System.out.println("--------------------------------");
			
			//���
			for (int i = list.size()-1; i>=0; i--) { //�Ųٷ� ���
				System.out.print(list.get(i).get("��ȣ"));
				System.out.print("\t"+list.get(i).get("����"));
				System.out.print("\t"+list.get(i).get("�ۼ���"));
				System.out.print("\t"+list.get(i).get("�ۼ���"));
				System.out.println();
				System.out.println("--------------------------------");
			}
			
			System.out.println("1. ��ȸ\t2. ���\t0. ����");
			System.out.println("��ȣ�� �Է��Ͻÿ�.");
			int input = sc.nextInt();
			
			switch (input) {
			case 1: //��ȸ
				System.out.println("��ȸ�� ��ù� ��ȣ�� �Է��Ͻÿ�.");
				int input1 = sc.nextInt();
				
				listData(input1);
				break;
			case 2: //���
				putData(number);
				number++;
				list.add(data);
				System.out.println("�� ��� �Ϸ�");
				break;
			case 0: //����
				System.out.println("���α׷� ����");
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
	
	private void listData(int input1) {
		for (int i = 0; i < list.size(); i++) {
			if ((int)list.get(i).get("��ȣ")==input1) {
				System.out.println("����: "+list.get(i).get("����"));
				System.out.println("����: "+list.get(i).get("����"));
				System.out.println("�ۼ���: "+list.get(i).get("�ۼ���"));
				System.out.println("�ۼ���: "+list.get(i).get("�ۼ���"));
				seeDetail(input1);
				return;
			}
		}
		
	}

	private void seeDetail(int input1) {
		while (true) {
			System.out.println("1. ����\t2. ����\t3. ���");
			int input = sc.nextInt();
			switch (input) {
			case 1: //�� ����
				modifyData(input1);
				break;
			case 2: //�� ����
				deleteData(input1);
				return;
			case 3: //�� �������
				
				return;

			default:
				break;
			}
		}
		
	}

	public void modifyData(int input1) {
		System.out.println("���� �����մϴ�.");
		for (int i = 0; i < list.size(); i++) {
			if ((int)list.get(i).get("��ȣ")==input1) { //�Է��� ��ȣ�� ��ġ.
				System.out.println("����: ");
				list.get(i).put("����", sc.next());
				System.out.println("����: ");
				list.get(i).put("����", sc.next());
				System.out.println("�ۼ���: ");
				list.get(i).put("�ۼ���", sc.next());
			}
		}
		
	}

	public void deleteData(int input1) {
		System.out.println("���� �����մϴ�.");
		for (int i = 0; i < list.size(); i++) {
			if ((int)list.get(i).get("��ȣ")==input1) { //�Է��� ��ȣ�� ��ġ.
				list.remove(i);
			}
		}
		
	}

	public void putData(int number) { //�� �ۼ�
		data = new HashMap<String, Object>();
		data.put("��ȣ", number);
		System.out.println("����: ");
		data.put("����", sc.next());
		System.out.println("����: ");
		data.put("����", sc.next());
		System.out.println("�ۼ���: ");
		data.put("�ۼ���", sc.next());
		
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");
		data.put("�ۼ���", format.format(date));
		
	}
}
