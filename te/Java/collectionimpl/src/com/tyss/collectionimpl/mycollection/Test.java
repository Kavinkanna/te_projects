package com.tyss.collectionimpl.mycollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
	public static void main(String[] args) {
//		ArrayList<Integer> array = new ArrayList<Integer>();
//
//		array.add(10);
//		array.add(30);
//		array.add(40);
//		array.add(20);
//		array.add(90);
//		array.add(60);
//
//		System.out.println(array);
//
//		Iterator<Integer> iterator = array.iterator();
//		System.out.println("Iterator");
//		while (iterator.hasNext()) {
//			System.out.print(iterator.next());
//			System.out.print(" ");
//		}
//		System.out.println(" --- ");
//		System.out.println("list iterator");
//		ListIterator<Integer> iterator2 = array.listIterator();
//		while (iterator2.hasNext()) {
//			System.out.print(iterator2.next());
//			System.out.print(" ");
//		}
//		System.out.println(" ");
//		
//		System.out.println("list previous iterator");
//		ListIterator<Integer> iterator3 = array.listIterator(array.size());
//		while (iterator3.hasPrevious()) {
//			System.out.print(iterator3.previous());
//			System.out.print(" ");
//		}
//		System.out.println(" ");
//		System.out.println("for loop");
//		for (int i = 0; i < array.size(); i++) {
//			System.out.print(array.get(i) +" ");
//		}
//		System.out.println("");
//		System.out.println("ForEach Loop");
//		
//		for (Integer integer : array) {
//			System.out.print(integer +" ");
//		}
//		
//		System.out.println(" sorting  ");
//		Collections.sort(array);
//		System.out.println(array);
//		
		SortById byId = new SortById();
		ArrayList<Person> arrayList = new ArrayList<Person>();
		arrayList.add(new Person(90, "Kiran"));
		arrayList.add(new Person(60, "Zabi"));
		arrayList.add(new Person(20, "Ankith"));
		arrayList.add(new Person(50, "Lohit"));
		
		
	
		System.out.println(arrayList);
		Collections.sort(arrayList,new SortById());
		System.out.println(arrayList);
		
	}
}


class SortByName implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		String nameOne = o1.name;
		String nameTwo = o2.name;
		return  nameOne.compareTo(nameTwo);
	}
	
}

class SortById implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		
		return o1.hashCode() - o2.hashCode();
	}
	
}