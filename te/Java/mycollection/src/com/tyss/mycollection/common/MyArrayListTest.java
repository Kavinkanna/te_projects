package com.tyss.mycollection.common;

public class MyArrayListTest {
	
	public static void main(String[] args) {
		MyArrayList<Integer> array = new MyArrayList<Integer>(5);
		
		array.add(10);
		array.add(20);
		array.add(30);
		array.add(40);
		array.add(50);
		
		
		for(int i= 0; i < array.size() ;i++) {
			System.out.println(array.get(i));
		}
		
		System.out.println("-----");
		for (Object object : array) {
			System.out.println(object);
		}
	}
}
