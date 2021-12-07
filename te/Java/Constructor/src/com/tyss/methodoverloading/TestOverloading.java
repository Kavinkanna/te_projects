package com.tyss.methodoverloading;

public class TestOverloading {

	public static void main(String[] args) {
		Overloading o=new Overloading();
		o.add();
		int a=o.add(30,20);
		System.out.println(a);
		o.add(10.5f,10);
		

	}

}
