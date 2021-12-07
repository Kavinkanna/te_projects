package com.tyss.Constructor;

public class Demo {

	public Demo() {
		super();
		 System.out.println("Default constructor");
	}
	public Demo(int x) {
		super();
		System.out.println("one parameter constructor"+ x);
	}
	public Demo(int x,int y) {
		super();
		System.out.println("two parameter constructor"+ x+" "+y);
	}
	

}
