package com.ttss.inter;

public class InterImplementMain {

	public static void main(String[] args) {
		Calculator c= new Calculator();
		c.add(10, 20);
		c.div(200, 10);
		c.mul(10, 10);
		c.sub(200, 100);
		c.intervariable();
		System.out.println(c.a);
		System.out.println(c.b);
		NewCal nc=new NewCal();
		nc.add(10, 20);
		nc.div(10, 20);
		nc.mul(10, 20);
		nc.sub(10, 20);
	}

}
