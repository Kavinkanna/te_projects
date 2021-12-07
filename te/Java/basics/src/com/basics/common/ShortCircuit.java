package com.basics.common;

public class ShortCircuit {

	public static void main(String[] args) {
		 int x, y, z;

		  x = 10;
		  y = 20;
		  z = 30;

		  // T T
		  // T F
		  // F T
		  // F F

		  System.out.println();
		  //SET A
		  boolean a = (x < z) && (x == x);
		  boolean b = (x < z) && (x == z);
		  boolean c = (x == z) && (x < z);
		  boolean d = (x == z) && (x > z);
		  //SET B    
		  boolean aa = (x < z) & (x == x);
		  boolean bb = (x < z) & (x == z);
		  boolean cc = (x == z) & (x < z);
		  boolean dd = (x == z) & (x > z);
		
	}
}
