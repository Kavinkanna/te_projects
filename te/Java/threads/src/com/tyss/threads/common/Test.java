package com.tyss.threads.common;

public class Test {

	public static void main(String[] args) {
		
		MyInterface interface1 = ()->{
				System.out.println(" success ");
				return true;
		};
		
		MyInterface interface2 = ()->{
			System.out.println(" Failure ");
			return false;
	};
		System.out.println(interface1.getData());
		System.out.println(interface2.getData());
	}
}
