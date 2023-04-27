package com.tech.w02;

public class Car {
	String color;
	int speed;
	boolean power=true;
	
	
	public static void main(String[] args) {
		int channel = 10;
		
		System.out.println(channel);
		Car c = new Car();
		c.runCar();
	}	
	public void runCar() {
		System.out.println("color: "+color);
		System.out.println("speed: "+speed);
		System.out.println("power: "+power);
		
	}	
	public void stopCar() {
		
	}
}
