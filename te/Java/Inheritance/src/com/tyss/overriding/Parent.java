package com.tyss.overriding;

public class Parent {
	Parent(){
		System.out.println("inside zero parameter");
	}
	Parent(int a){
		System.out.println("inside 1 parameter");
		this.a=a;
	}
	
	int a;
	void bike() {
		System.out.println("parents bike");
	}
	
}
