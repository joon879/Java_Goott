package com.tech.w07othercall;

public class Car {

	String company = "����";
	String model;
	String color;
	int maxSpeed;
	
	public Car(String model) {
//		this.model = model;
		this(model,"����",250); //�ٸ� ������ ȣ��. ù�ٿ� this()�� �;� �Ѵ�!
		System.out.println("�̰��� ���ļ� �ٸ� ������ ȣ��");
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
