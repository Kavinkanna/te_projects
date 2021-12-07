package com.tyss.collectionimpl.mycollection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapImpl {
	public static void main(String[] args) {
		TreeMap<Integer, String> s1 = new TreeMap<Integer, String>();
		s1.put(10, "me");
		
		s1.put(23, "you");
		
		s1.put(2, "nobody");
		
		Set<Map.Entry<Integer, String>> mp = s1.entrySet();
		for (Entry<Integer, String> entry : mp) {
			System.out.println(entry);
			System.out.println(entry.getValue());
			System.out.println(entry.getKey());
		}
	}
}
