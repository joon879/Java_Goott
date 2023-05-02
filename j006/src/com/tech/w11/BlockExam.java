package com.tech.w11;

public class BlockExam {
	//static block은 단 한 번만 호출
	static {
		System.out.println("static block");
	}
	
	public static void main(String[] args) {
		BlockExam bx1 = new BlockExam();
		BlockExam bx2= new BlockExam();
		BlockExam bx3= new BlockExam();
		bx1.doPrint();
		bx2.doPrint();
		bx3.doPrint();
	}
	
	private void doPrint() {
		System.out.println("A_print");
	}
}
