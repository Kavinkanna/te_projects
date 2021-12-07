package com.tyss.mapinterface.common;

import java.util.Comparator;

public class SortByName implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		String name1 = o1.name;
		String name2 = o2.name;
		return name1.compareTo(name2);
	}
}
