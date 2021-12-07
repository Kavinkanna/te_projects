package com.tyss.Constructor;

public class Bike extends Vehicle {
	int maxSpeed=125;
	
	void printMaxSpeed() {
		System.out.println(maxSpeed);
		System.out.println(super.maxSpeed);
	}
}
