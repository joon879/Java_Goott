package com.tech.w09exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileErrorExam {
	private int[] list;
	private static final int SIZE = 10;
	
	public FileErrorExam() {
		list = new int[SIZE];
		for (int i = 0; i < SIZE; i++) {
			list[i] = i;
		}
		writeList();
	}

	private void writeList() {
		//����µ���
		PrintWriter out = null; //��µ���
		BufferedReader in = null; //�Էµ���
		
		try {
			in = new BufferedReader(new FileReader("infile.txt"));
			for (int i = 0; i < SIZE; i++) {
				list[i] = i;
				list[11] = 10;
			}
			System.out.println("�����۵�");
						
		} catch (FileNotFoundException e) {
			System.out.println("���ܹ߻�");			
			e.printStackTrace();
		} finally {//������ �ְ� ���� ������ ����Ǵ� ���. (�� ó���ؾ� �� ������ �ִ´�.)
			System.out.println("finally block end");
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		new FileErrorExam();
	}
}
