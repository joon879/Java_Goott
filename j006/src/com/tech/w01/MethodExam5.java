package com.tech.w01;

public class MethodExam5 {
	public static void main(String[] args) {
		MethodExam5 m1 = new MethodExam5();
		
	
		int getSum = m1.makeSum(1, 10);
		System.out.println("return: "+getSum);
		float getAvg = m1.makeAvg(getSum,5);
		System.out.println("return: "+getAvg);
		
		
	}
	//makeSum
	public int makeSum(int getStart, int getEnd) {
		int sum = 0;
		int start = getStart;
		int end = getEnd;
		for (int i = start; i <= end; i++) {
			sum += i;
		}

		return sum;
	}
	//makeAvg
	public float makeAvg(int tot, int cnt) {
		float avg = (float)tot/cnt;
		
		return avg;
	}

	

}
