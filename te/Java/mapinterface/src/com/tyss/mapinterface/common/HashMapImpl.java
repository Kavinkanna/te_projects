package com.tyss.mapinterface.common;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapImpl {

	public static void main(String[] args) {
		HashMap<String, Long> hashmap = new HashMap<String, Long>();

		hashmap.put("zain", 900090909L);
		hashmap.put("abc", 9768768769L);
		hashmap.put(null, 987987987L);
		hashmap.put("kartic", 9898989898L);
		hashmap.put("manju", 7676766767L);
		hashmap.put("zain", 900090909L);
		hashmap.put(null, 987987987L);

		System.out.println(hashmap);
		System.out.println(" ---- get based on key --------");
		System.out.println(hashmap.get("zain"));

		Set<Map.Entry<String, Long>> entries = hashmap.entrySet();
		System.out.println(" --- entries -----");

		for (Map.Entry<String, Long> entry : entries) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("------");
		}

		Collection<String> set = hashmap.keySet();
		
		System.out.println(set);
		
		Collection<Long> collection = 	hashmap.values();
		System.out.println(collection);

	}
}
