package com.tyss.mycollection.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class PersonTest {

	public static void main(String[] args) {
		LinkedList<Person> arrayList = new LinkedList<Person>();

		arrayList.add(new Person(90, "Prateek"));
		arrayList.add(new Person(20, "Jeevan"));
		arrayList.add(new Person(70, "Santosh"));
		arrayList.add(new Person(10, "Amar"));
		arrayList.add(new Person(80, "Nilim"));
		arrayList.add(new Person(8, "Bunny"));

		Iterator<Person> iterator =  arrayList.iterator();
		
		while(iterator.hasNext()) {
			arrayList.add(new Person(90, "harish"));
			System.out.println(iterator.next());
		}

	}
}
