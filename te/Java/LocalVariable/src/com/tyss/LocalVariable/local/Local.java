package com.tyss.LocalVariable.local;

public class Local {

	int a=10;//instance variable
	public void local() {
		int a=5;//accessible only with in the function //initialization is mandatory
		System.out.println(a);
		System.out.println("this is used to print instance variable " + this.a);
	}
}
