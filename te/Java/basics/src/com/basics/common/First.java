package com.basics.common;

public class First {
	public static void main(String[] args) {
		MainClass first = new MainClass();
		
	}
}

class MainClass{
	
	static int a ;
	static {
		 a = 10;
		System.out.println(a + " inside static block");
	}
	public MainClass() {
		System.out.println("Constructor called ");
	}
}