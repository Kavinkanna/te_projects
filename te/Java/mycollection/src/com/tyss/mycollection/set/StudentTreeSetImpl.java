package com.tyss.mycollection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class StudentTreeSetImpl {

	public static void main(String[] args) {
		Student student1 = new Student(10, "Tom", 8, 98);
		Student student2 = new Student(20, "Smith", 9, 74);
		Student student3 = new Student(30, "Virat", 6, 36);
		Student student4 = new Student(20, "Virat", 3, 36);
		Student student5 = new Student(50, "Anushka", 7, 70);
		
		SortByName byName = new SortByName();
		SortByMarks byMarks = new SortByMarks();
		
		TreeSet<Student> students = new TreeSet<Student>(byMarks);
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		
		Iterator<Student> iterator = students.iterator();
		
		while (iterator.hasNext()) {
			Student student = (Student) iterator.next();
			System.out.println(student);
			
		}
		
		
	}
}
