package com.tech.w02setmap;

import java.util.Stack;

public class StackTest {
	
	public static void main(String[] args) {
		// STACK
		// First in Last out = stack
		// Last in First out = queue
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		
		
		System.out.println(stack);
		System.out.println(stack.empty()); //stack의 내용이 비어있느냐? -> true or false.
		
		
		//데이터 제거
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.empty());
		
	}
}
