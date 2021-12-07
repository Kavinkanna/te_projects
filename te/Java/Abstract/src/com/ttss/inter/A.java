package com.ttss.inter;

public interface A {

	void play();
	
	default void rest() {
		System.out.println("player is resting");
	}
}
