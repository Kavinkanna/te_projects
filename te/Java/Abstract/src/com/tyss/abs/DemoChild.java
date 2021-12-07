package com.tyss.abs;

public abstract class DemoChild extends Demo {

	public DemoChild() {
		super(10,20);
	}
	@Override
	void dostuff() {
		System.out.println("do stuff body is given in DemoChild");

	}

	void ownMethod() {
		System.out.println("hii its Demochild's own method");
	}
}
