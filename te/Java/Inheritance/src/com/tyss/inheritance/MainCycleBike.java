package com.tyss.inheritance;

public class MainCycleBike {

	public static void main(String[] args) {
	
		
		Bike bike=new Bike();
		System.out.println(bike.cost);
		bike.move();
		bike.start();
		
		Cycle c=new Bike();
		System.out.println(c.cost);
		c.move();
	}

}
