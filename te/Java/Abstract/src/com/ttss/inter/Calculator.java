package com.ttss.inter;

public class Calculator implements Inter {

	
	@Override
	public void add(int a,int b) {
		System.out.println("addition is "+ (a+b));
		
	}

	@Override
	public void sub(int a,int b) {
		System.out.println("subtraction is "+ (a-b));
	}

	@Override
	public void mul(int a,int b) {
		System.out.println("Multiplication is "+ a*b);

	}

	@Override
	public void div(int a ,int b) {
		System.out.println("division is " + a/b);

	}
	
	public void intervariable(){
		System.out.println(a);
		System.out.println(b);
		
	}

}
