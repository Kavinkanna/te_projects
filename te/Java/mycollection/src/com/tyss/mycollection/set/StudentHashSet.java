package com.tyss.mycollection.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class StudentHashSet {

	public static void main(String[] args) {
		HashSet<Student> students = new HashSet<Student>();

		Student student1 = new Student(10, "Tom", 8, 98);
		Student student2 = new Student(20, "Smith", 9, 74);
		Student student3 = new Student(30, "Virat", 6, 36);
		Student student4 = new Student(20, "Virat", 3, 36);
		Student student5 = new Student(50, "Anushka", 7, 70);

		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);

		Iterator<Student> iterator = students.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());			
		}
		
		ArrayList list = new ArrayList(students);
		Collections.sort(list);
		
		System.out.println("after sort");
		
		Iterator iterator2 = list.iterator();
		
		while (iterator2.hasNext()) {
			
			System.out.println(iterator2.next());
		}
		
	 
		
		
	}
}
