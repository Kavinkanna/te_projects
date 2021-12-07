package com.tyss.methodoverloading;

public class Overloading {

	
	void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	
	int add(int a,int b) {
		
		return a+b;
	}
	
	void add(float a,int b) {
		System.out.println(a+b);
	}
	
	void add(int a,float b) {
		System.out.println(a+b);
	}
	
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	void add(float a, int b, int c) {
		System.out.println(a+b+c);
	}
	void add(int a, float b, int c) {
		System.out.println(a+b+c);
	}
	void add(int a, int b, float c) {
		System.out.println(a+b+c);
	}
	void add(int a, float b, float c) {
		System.out.println(a+b+c);
	}
	void add(float a, int b, float c) {
		System.out.println(a+b+c);
	}
	void add(float a, float b, int c) {
		System.out.println(a+b+c);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	void add(float a,float b,float c) {
		System.out.println(a+b+c);
	}
	
}

