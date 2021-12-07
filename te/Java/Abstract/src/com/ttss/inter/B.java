package com.ttss.inter;

public interface B extends A {
	void work();
	 default void takebreak() {
		System.out.println("take break during work");
	}
	 static void haveFood() {
		 System.out.println("have food");
	 }
}
