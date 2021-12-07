package com.tyss.mycollection.set;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetImpl {
	public static void main(String[] args) {
		TreeSet<Integer> integers = new TreeSet<Integer>();
		
		integers.add(5);
		integers.add(6);
		integers.add(8);
		integers.add(1);
		integers.add(2);
		integers.add(7);
		integers.add(13);
		integers.add(11);
		integers.add(15);
		integers.add(4);
		
		
		Iterator<Integer>  iterator = integers.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
	}
}
