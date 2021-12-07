package com.tyss.InternalConstructorChaining;

public class Sample {

	Sample(){
		this("rohan");
		System.out.println("inside zero parameterized constructor");
	}
	Sample(String s){
		this(10,20);
		System.out.println("inside one parameterized constructor");
	}
	Sample(int i,int j){
		
		System.out.println("inside two parameterized constructor");
	}
}
