package com.tyss.abs;

public abstract class Demo {

	Demo(){
		
	}
	Demo(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	static int a;
	int b;
	 abstract  void dostuff();
	 abstract void dostuff1();
	static void dowork() {
		System.out.println("hii how u doing!");
	}
}
