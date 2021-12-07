package com.tyss.inheritance;

public class MainCalculator {

	public static void main(String[] args) {
	Calculator c=new Calculator();
	ScientificCalculator sc=new ScientificCalculator();
	SpaceCalculator spc= new SpaceCalculator();
	c.add(10, 20);
	c.mul(10, 20);
	c.div(10, 20);
	c.sub(10, 20);
	sc.add(10, 20);
	sc.mul(10, 20);
	sc.div(10, 20);
	sc.sub(10, 20);
	sc.square(4);
	sc.squareroot(9);
	spc.add(10, 30);
	spc.sub(30, 40);
	spc.mul(30, 40);
	spc.div(100, 2);
	spc.square(8);
	spc.squareroot(49);
	spc.modulus(10, 2);
	
	

	}

}
