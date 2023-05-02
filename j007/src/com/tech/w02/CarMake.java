package com.tech.w02;

public class CarMake {
	public static void main(String[] args) {

		BenzClass bc = new BenzClass();
		EquusClass ec = new EquusClass();
		SonataClass sc = new SonataClass();

		bc.carBase();
		bc.doJoripBenz();
		System.out.println();

		ec.carBase();
		ec.doJoripEquus();
		System.out.println();

		sc.carBase();
		sc.doJoripSonata();
		System.out.println();
	}
}
