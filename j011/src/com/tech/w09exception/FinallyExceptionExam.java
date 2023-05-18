package com.tech.w09exception;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FinallyExceptionExam {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		Date d = null;
		//������ ���� ī��
				
		try {
			//�Էµ���
			fr = new FileReader("inSchool.txt");
			br = new BufferedReader(fr);
			
			//��µ���
			fw = new FileWriter("outSchool.txt", false);
			bw = new BufferedWriter(fw);
			
			String s = null;
			d = new Date();//����ð�
			
			//����ī��
			long start = d.getTime();
			System.out.println("����ð�: "+start);
			
			//ī��
			while ((s = br.readLine()) != null) { //���Ͽ��� �������� �Է¹ޱ�.(�� �� ������)
				bw.write(s); //bw�� ���
				bw.newLine(); //�ٹٲٱ�.				
			}
			d = new Date(); //����ð�
			long end = d.getTime();
			System.out.println("��Ż ���翡 ����� �ð�: "+(end-start));
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//�ڿ� ȸ���� �������� ���� ���.
			//fr, br, fw, bw �����.
			if (br != null) {try {br.close();} catch (IOException e) {}}
			if (fr != null) {try {fr.close();} catch (IOException e) {}}
			if (bw != null) {try {bw.close();} catch (IOException e) {}}
			if (fw != null) {try {fw.close();} catch (IOException e) {}}
		}
		
	}
}
