package com.tyss.Chaining;

public class ConstructorChainingDemo {

	public static void main(String[] args) {
		Child c=new Child();
		
		System.out.println(c.bike);
		System.out.println(c.money);
		c.listOfProperties();

	}

}
