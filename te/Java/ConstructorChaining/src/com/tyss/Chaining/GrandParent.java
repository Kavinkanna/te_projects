package com.tyss.Chaining;

public class GrandParent {

	GrandParent(){
		System.out.println("inside grand pa's constructor");
	}
	int money=2500000;
	String[] property= {"house","land","farmhouse"};
	String bike="hero honda";
	
	void listOfProperties() {
		for(String s:property) {
			System.out.println(s);
		}
	}
	
	
	
}
