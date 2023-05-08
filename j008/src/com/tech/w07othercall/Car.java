package com.tech.w07othercall;

public class Car {

	String company = "현대";
	String model;
	String color;
	int maxSpeed;
	
	public Car(String model) {
//		this.model = model;
		this(model,"은색",250); //다른 생성자 호출. 첫줄에 this()가 와야 한다!
		System.out.println("이곳을 거쳐서 다른 생성자 호출");
	}

	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public void printMyCarInfo() {
		System.out.println("company: "+company);
		System.out.println("model: "+model);
		System.out.println("color: "+color);
		System.out.println("maxSpeed: "+maxSpeed);
	}

}
