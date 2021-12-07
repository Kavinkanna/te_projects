package com.tyss.Chaining;

public class Parent extends GrandParent {

	Parent(){
		System.out.println("inside parents constructor");
	}
	
	String property[]= {"shop@ursroad"};
	int money=100000;
	
	void listOfProperties() {
		for(String s:property) {
			System.out.println(s);
		}
	}
}
