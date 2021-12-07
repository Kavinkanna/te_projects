package com.tyss.Constructor;
public class Facebook {
 protected Facebook(){
	System.out.println("inside zero arg constructor");
}

protected Facebook(int a){
	System.out.println("inside parameterized constructor");
	this.a=a;
}

int a;


}