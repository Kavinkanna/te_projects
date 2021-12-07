package com.tyss.basics.sub;

public interface MyInterface {

	public static void name() {
		System.out.println("static Method");
	}

	default void getName() {
		System.out.println("Hi ");
	}
}
