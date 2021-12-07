package com.tyss.mapinterface.common;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class MyArrayList {

	public static void main(String[] args) {

//		List<String> list = new ArrayList<String>();
		List<String> list = new Vector<String>();
		
		list.add("Chandan");
		list.add("Raj");
		list.add("Rahul");
		list.add("Rohan");
		list.add("Sharath");

		Iterator<String> iterator = list.iterator();
		iterator.toString();

		System.out.println("Iterator Impl Class ===> "+iterator.getClass());
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}// end of main
}// end of class
