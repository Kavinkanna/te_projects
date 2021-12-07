package com.tyss.mycollection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetImpl {
	public static void main(String[] args) {
		HashSet hashSet = new HashSet();

		hashSet.add(10);
		hashSet.add(true);
		hashSet.add("ABC");
		hashSet.add(null);
		hashSet.add(10);
		hashSet.add(null);

		Iterator iterator = hashSet.iterator();

		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}
}
