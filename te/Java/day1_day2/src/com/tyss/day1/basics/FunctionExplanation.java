package com.tyss.day1.basics;

public class FunctionExplanation {

	public static void main(String[] args) {
		
		int a=20;
		int b=10;
		System.out.println("addition of numbers are: "+ Function.add(a,b));
		System.out.println("subtraction of numbers are: "+ Function.sub(a,b));
		System.out.println("multiplication of number is "+Function.mul(a, b));
		Function.div(a,b);

	}
	

}

class Function{
	
	public static int add(int a,int b) {
		int c= a+b;
		return c;
		
	}
	public static int sub(int a,int b) {
		int c= a-b;
		return c;
		
	}
	public static int mul(int a,int b) {
		int c= a*b;
		return c;
		
	}
	public static void div(int a,int b) {
		int c= a/b;
		System.out.println("division of numbers are: "+c);
		
	}
	
}
