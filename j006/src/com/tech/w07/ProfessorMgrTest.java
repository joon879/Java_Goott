package com.tech.w07;

public class ProfessorMgrTest {
	public static void main(String[] args) {
//		이름을 전달하고 (StudentName으로)
//		해당하는 비밀번호를 리턴받아 메인에서 출력
//		홍길동 입력하면 -> 1234
//		홍길순 5678
//		메인에서 출력: 홍길동 비밀번호는 1234이다.
		
		StudentName st_name = new StudentName();
		st_name.Judge("홍길동");
		System.out.println("홍길동의 PASS는 "+st_name.getPass());
		
		st_name.Judge("홍길순");
		System.out.println("홍길순의 PASS는 "+st_name.getPass());
	}
}
