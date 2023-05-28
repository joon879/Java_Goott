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
			System.out.println("No\t제목\t작성자\t작성일");
			System.out.println("--------------------------------");
			
			//출력
			for (int i = list.size()-1; i>=0; i--) { //거꾸로 출력
				System.out.print(list.get(i).get("번호"));
				System.out.print("\t"+list.get(i).get("제목"));
				System.out.print("\t"+list.get(i).get("작성자"));
				System.out.print("\t"+list.get(i).get("작성일"));
				System.out.println();
				System.out.println("--------------------------------");
			}
			
			System.out.println("1. 조회\t2. 등록\t0. 종료");
			System.out.println("번호를 입력하시오.");
			int input = sc.nextInt();
			
			switch (input) {
			case 1: //조회
				System.out.println("조회할 계시물 번호를 입력하시오.");
				int input1 = sc.nextInt();
				
				listData(input1);
				break;
			case 2: //등록
				putData(number);
				number++;
				list.add(data);
				System.out.println("글 등록 완료");
				break;
			case 0: //종료
				System.out.println("프로그램 종료");
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
	
	private void listData(int input1) {
		for (int i = 0; i < list.size(); i++) {
			if ((int)list.get(i).get("번호")==input1) {
				System.out.println("제목: "+list.get(i).get("제목"));
				System.out.println("내용: "+list.get(i).get("내용"));
				System.out.println("작성자: "+list.get(i).get("작성자"));
				System.out.println("작성일: "+list.get(i).get("작성일"));
				seeDetail(input1);
				return;
			}
		}
		
	}

	private void seeDetail(int input1) {
		while (true) {
			System.out.println("1. 수정\t2. 삭제\t3. 목록");
			int input = sc.nextInt();
			switch (input) {
			case 1: //글 수정
				modifyData(input1);
				break;
			case 2: //글 삭제
				deleteData(input1);
				return;
			case 3: //글 목록으로
				
				return;

			default:
				break;
			}
		}
		
	}

	public void modifyData(int input1) {
		System.out.println("글을 수정합니다.");
		for (int i = 0; i < list.size(); i++) {
			if ((int)list.get(i).get("번호")==input1) { //입력한 번호와 일치.
				System.out.println("제목: ");
				list.get(i).put("제목", sc.next());
				System.out.println("내용: ");
				list.get(i).put("내용", sc.next());
				System.out.println("작성자: ");
				list.get(i).put("작성자", sc.next());
			}
		}
		
	}

	public void deleteData(int input1) {
		System.out.println("글을 삭제합니다.");
		for (int i = 0; i < list.size(); i++) {
			if ((int)list.get(i).get("번호")==input1) { //입력한 번호와 일치.
				list.remove(i);
			}
		}
		
	}

	public void putData(int number) { //글 작성
		data = new HashMap<String, Object>();
		data.put("번호", number);
		System.out.println("제목: ");
		data.put("제목", sc.next());
		System.out.println("내용: ");
		data.put("내용", sc.next());
		System.out.println("작성자: ");
		data.put("작성자", sc.next());
		
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");
		data.put("작성일", format.format(date));
		
	}
}
