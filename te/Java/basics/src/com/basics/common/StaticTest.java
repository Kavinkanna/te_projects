package com.basics.common;

import  static  com.basics.common.MyStaticMethods.*;

public class StaticTest {

	{
		System.out.println("hi");
	}
	
	public StaticTest() {
		System.out.println("constructor");
	}
	static final  String name = "";
	final String urName ="";
	int a =0;
	static int b = 0;
	public static void main(String[] names) {
		new StaticTest();
//		System.out.println(a);
		System.out.println(name);
//		System.out.println(urName);
		getName();
		printName();
		System.out.println(b);
		byte b = 127;
		byte c = 9;
		new StaticTest().new Test().getInnerCalss();
	}
	public void getData() {
		System.out.println(name);
//		urName = "ntg";
		System.out.println(a);
		System.out.println(b);
	}
	
	class Test{
		public void getInnerCalss() {
			
			System.out.println("inner class");
		}
	}
}
