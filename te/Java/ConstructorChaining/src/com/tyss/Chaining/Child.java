package com.tyss.Chaining;

public class Child extends Parent {

	Child(){
		System.out.println("inside childs constructor");
	}
	
	String[] property= super.property;
	
	void listOfProperties() {
		for(String s:property) {
			System.out.println(s);
		}
	}
}
