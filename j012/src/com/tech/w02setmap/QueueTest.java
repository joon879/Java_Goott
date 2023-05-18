package com.tech.w02setmap;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		// Queue
		// First in Last out = stack
		// Last in First out = queue
		Queue<Integer> que = new LinkedList<Integer>();

		que.add(6);
		que.add(11);
		que.add(3);
		que.add(12);

		System.out.println("queue¿« ∞πºˆ1: " + que.size());
		int count = que.size();

		int qcnt = 0;

		// µ•¿Ã≈Õ ≤®≥ª±‚
		for (int i = 0; i < count; i++) {
			qcnt = que.size();
			System.out.println(que.poll());

		}
		System.out.println("queue¿« ∞πºˆ2: " + que.size());

	}
}
