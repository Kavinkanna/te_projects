package com.tyss.mapinterface.common;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class StudentTreeMapImpl {

	public static void main(String[] args) {
		TreeMap<Student, Integer> students = new TreeMap<Student, Integer>(new SortByName());
		students.put(new Student(14, "Zain"), 90);
		students.put(new Student(11, "Kiran"), 90);
		students.put(new Student(18, "Guru"), 90);
		students.put(new Student(7, "Hemanth"), 90);
		students.put(new Student(23, "ABc"), 90);

		System.out.println(students);

		Set<Entry<Student, Integer>> entries = students.entrySet();
		
		for (Entry<Student, Integer> entry : entries) {
			System.out.println(entry.getKey());
		}
	}

}
