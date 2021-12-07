package com.basics.common;

public class ClassLevel {
		static String name = "Hiremath";
		int a ;
		
		public static void main(String[] args) {
			String name = "kiran";
			int a = 10;
			System.out.println(name);
//			System.out.println(a);
			System.out.println(ClassLevel.name);
//			System.out.println(ClassLevel.a);
			
			System.out.println(name);
			System.out.println(a);
			getName();
		}
		
		public static void getName() {
			System.out.println(name);
			System.out.println();
		}
}
