package com.tyss.inheritance;

public class MainBike {

	public static void main(String[] args) {
		Tvs t=new Tvs();
		System.out.println(t.cc);
		System.out.println(t.chasisno);
		System.out.println(t.color);
		t.name();
		t.type();
		
		Hero h=new Hero();
		System.out.println(h.chasisno);
		System.out.println(h.color);
		h.type();
		h.name();
		

	}

}
