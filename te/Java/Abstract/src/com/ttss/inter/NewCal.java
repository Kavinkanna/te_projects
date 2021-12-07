package com.ttss.inter;

public class NewCal implements Inter {

	@Override
	public void add(int a, int b) {
		System.out.println("addition is "+ (this.a+this.b ));

	}

	@Override
	public void sub(int a, int b) {
		System.out.println("subtraction is "+ (this.a-this.b ));

	}

	@Override
	public void mul(int a, int b) {
		System.out.println("Multiplication is "+ (this.a*this.b ));


	}

	@Override
	public void div(int a, int b) {
		System.out.println("division is "+ (this.a/this.b ));


	}

}
