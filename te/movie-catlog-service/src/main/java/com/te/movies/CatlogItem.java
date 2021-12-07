package com.te.movies;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CatlogItem {

	public CatlogItem() {
		
	}
	
	private String name;

	private String des;

	private int ratring;
}
