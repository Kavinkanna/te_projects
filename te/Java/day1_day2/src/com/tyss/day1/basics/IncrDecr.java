package com.tyss.day1.basics;

public class IncrDecr {

	public static void main(String[] args) {
		
		int a=5;
		int b=4;
			// 6  4
		int c=++a+b++;
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
		
		
		
		int k=10;
	    System.out.println(++k);
	    System.out.println(k++);
	    
	    int kn=10;
	    int l=kn++;
	    int p=++kn;
	    
	    System.out.println(l + " post increment");
	    System.out.println(p + " pre increment");
	    
	    int aa= kn--;
	    System.out.println(aa);
	    int ab=--kn;
	    System.out.println(ab);
		
	    //cannot use increment and decrement operator directly with values
		
		/*note: */
	}

}
